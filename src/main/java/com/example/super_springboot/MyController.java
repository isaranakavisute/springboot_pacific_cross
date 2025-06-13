package com.example.super_springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class MyController {
    @Autowired
    private UserService userService;

    @Autowired
    private ADODB_LOGSQLRepository1 ADODB_LOGSQLRepository1;

    @Autowired
    private MR_MEMBER_Repository mr_member_repository;

    @Autowired
    private MR_POLICY_Repository mr_policy_repository;

    @Autowired
    private MR_MEMBER_PLAN_Repository mr_member_plan_repository;

    @Autowired
    private MR_POLICY_PLAN_Repository my_policy_plan_repository;

    @Autowired
    private MR_POLICY_HOLDER_Repository my_policy_holder_repository;

    @Autowired
    private PD_PLAN_Repository pd_plan_repository;

    @GetMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/mycontroller")
    public String isara() {
        return "Greetings from mycontroller";
    }

    @GetMapping(path="/checkdb")
    public List<SQL1> checkdb() {
        List<SQL1> retval = new ArrayList<>();
        SQL1 sql_obj = new SQL1();
        List<ADODB_LOGSQL> list_obj = (List<ADODB_LOGSQL>) ADODB_LOGSQLRepository1.Get_SQL0_SQL1();

        for (int i = 0 ; i < list_obj.size() ; i++) {
            sql_obj.setSQL1(list_obj.get(i).getSQL1());
            retval.add(sql_obj);
        }
     return retval;
    }

    @GetMapping(path="/checkdb1")
    public List<SQL1> checkdb1() {
        return checkdb();
    }

    @PostMapping(path="/inquiry_personal_information")
    public member_info inquiry_personal_information(@RequestParam Map<String, String> requestParams) {

        String MBR_NO = requestParams.get("MBR_NO");
        member_info member_info_obj = new member_info();

        List<MrMember> member_obj = (List<MrMember>) mr_member_repository.get_MEMB_OID(MBR_NO);
        if (member_obj.size() >= 1)
        {
            member_info_obj.setMember_no(member_obj.get(0).getMbrNo());
            member_info_obj.setEmpid(member_obj.get(0).getMbrNo());
            member_info_obj.setMemb_oid(member_obj.get(0).getMemb_oid());
            member_info_obj.setName(member_obj.get(0).getMbr_first_name() + " " +  member_obj.get(0).getMbr_last_name());
            member_info_obj.setDate_of_birth(member_obj.get(0).getDOB());
            member_info_obj.setAccount_no(member_obj.get(0).getCL_PAY_ACCT_NO());
            member_info_obj.setMember_type(member_obj.get(0).getSCMA_OID_MBR_TYPE());
            member_info_obj.setMarital_status(member_obj.get(0).getSCMA_OID_CIVIL_STATUS());
            member_info_obj.setGender(member_obj.get(0).getSCMA_OID_SEX());
            member_info_obj.setId_card(member_obj.get(0).getID_CARD_NO());
            member_info_obj.setMember_refno(member_obj.get(0).getCUSM_REF_NO());
            List<MrMemberPlan> member_plan_obj = (List<MrMemberPlan>) mr_member_plan_repository.get_POPL_OID(member_obj.get(0).getMemb_oid());
            if (member_plan_obj.size() >= 1)
            {
                member_info_obj.setStart_date(member_plan_obj.get(0).getEff_date());
                member_info_obj.setEnd_date(member_plan_obj.get(0).getExp_date());

                LocalDate today = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"); // Adjust format as needed
                LocalDate TargetDate = LocalDate.parse(member_info_obj.getEnd_date(), formatter);

                if (TargetDate.isAfter(today))
                    member_info_obj.setStatus("Active");
                else
                    member_info_obj.setStatus("Inactive");

                member_info_obj.setPOPL_OID(member_plan_obj.get(0).getPoplOid());
                List<MrPolicyPlan> policy_plan_obj = (List<MrPolicyPlan>) my_policy_plan_repository.get_POCY_OID(member_plan_obj.get(0).getPoplOid());
                if (policy_plan_obj.size() >= 1)
                {
                    member_info_obj.setPOCY_OID(policy_plan_obj.get(0).getPocyOid());
                    List<MrPolicy> policy_obj = (List<MrPolicy>) mr_policy_repository.get_policy_no(policy_plan_obj.get(0).getPocyOid());
                    if (policy_obj.size() >= 1)
                    {
                        member_info_obj.setPolicy_no(policy_obj.get(0).getPocyNo());
                        member_info_obj.setGroup_id(policy_obj.get(0).getPocyNo());
                        member_info_obj.setRef_policyno(policy_obj.get(0).getLMG_NO());
                        List<MrPolicyholder> policy_holder_obj = (List<MrPolicyholder>) my_policy_holder_repository.get_poho_name(policy_obj.get(0).getPohoOid());
                        if (policy_holder_obj.size() >= 1) {
                            member_info_obj.setBranch(policy_holder_obj.get(0).getCustomer_branch());
                            member_info_obj.setPolicy_holder(policy_holder_obj.get(0).getPoho_name_1() + " " + policy_holder_obj.get(0).getPoho_name_2());
                            member_info_obj.setCompany_name(policy_holder_obj.get(0).getPoho_name_1() + " " + policy_holder_obj.get(0).getPoho_name_2());
                            member_info_obj.setPolicy_type(policy_holder_obj.get(0).getSCMA_OID_POHO_TYPE());
                            List<PdPlan> pdplan_obj = (List<PdPlan>) pd_plan_repository.get_PLAN_ID(policy_plan_obj.get(0).getPlanOid());
                            if (pdplan_obj.size() >= 1) {
                                member_info_obj.setToc(pdplan_obj.get(0).getPlanId());
                                member_info_obj.setPplan(pdplan_obj.get(0).getPlan_no().trim());
                            } else {
                                return member_info_obj;
                            }
                        }
                        else
                        {
                            return member_info_obj;
                        }
                    }
                    else
                    {
                        return member_info_obj;
                    }
                }
                else
                {
                    return member_info_obj;
                }
            }
            else
            {
                return member_info_obj;
            }

//            List<MrPolicy> policy_obj = (List<MrPolicy>) mr_policy_repository.get_policy_no(member_obj.get(0).getPohoOid());
//            if (policy_obj.size() >= 1)
//            {
//                member_info_obj.setPolicy_no(policy_obj.get(0).getPocyNo());
//            }
//            else
//            {
//                return member_info_obj;
//            }

            return member_info_obj;
        }
        else
        {
            return member_info_obj;
        }
    }




}







