package com.esoft.smartstudentmanagement.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class School {
    @SerializedName("ssm_schoolid")
    @Expose
    private String ssmSchoolid;
    @SerializedName("sch_admin_id")
    @Expose
    private String schAdminId;
    @SerializedName("org_code")
    @Expose
    private String orgCode;
    @SerializedName("sch_code")
    @Expose
    private String schCode;
    @SerializedName("sch_name")
    @Expose
    private String schName;
    @SerializedName("sch_email")
    @Expose
    private String schEmail;
    @SerializedName("sch_contact")
    @Expose
    private String schContact;
    @SerializedName("sch_student_strength")
    @Expose
    private String schStudentStrength;
    @SerializedName("sch_city")
    @Expose
    private String schCity;
    @SerializedName("sch_dist")
    @Expose
    private String schDist;
    @SerializedName("sch_taluka")
    @Expose
    private String schTaluka;
    @SerializedName("sch_vibhag")
    @Expose
    private String schVibhag;
    @SerializedName("sch_province")
    @Expose
    private String schProvince;
    @SerializedName("sch_state")
    @Expose
    private String schState;
    @SerializedName("sch_pincode")
    @Expose
    private String schPincode;
    @SerializedName("sch_address")
    @Expose
    private String schAddress;
    @SerializedName("sch_country")
    @Expose
    private String schCountry;
    @SerializedName("sch_description")
    @Expose
    private String schDescription;
    @SerializedName("sch_image")
    @Expose
    private String schImage;
    @SerializedName("ecrm_code")
    @Expose
    private String ecrmCode;
    @SerializedName("sch_module_acedamic")
    @Expose
    private String schModuleAcedamic;
    @SerializedName("sch_module_library")
    @Expose
    private String schModuleLibrary;
    @SerializedName("sch_module_hostel")
    @Expose
    private String schModuleHostel;
    @SerializedName("sch_module_bus")
    @Expose
    private String schModuleBus;
    @SerializedName("sch_module_food")
    @Expose
    private String schModuleFood;
    @SerializedName("sch_module_HR")
    @Expose
    private String schModuleHR;
    @SerializedName("sch_module_app_admin")
    @Expose
    private String schModuleAppAdmin;
    @SerializedName("sch_module_app_teacher")
    @Expose
    private String schModuleAppTeacher;
    @SerializedName("sch_module_app_std")
    @Expose
    private String schModuleAppStd;
    @SerializedName("sch_expiry_date")
    @Expose
    private String schExpiryDate;
    @SerializedName("sch_status")
    @Expose
    private String schStatus;
    @SerializedName("sch_remarks")
    @Expose
    private String schRemarks;
    @SerializedName("servies_availed")
    @Expose
    private String serviesAvailed;
    @SerializedName("plan_expiry_date")
    @Expose
    private String planExpiryDate;
    @SerializedName("plan_grace_end_date")
    @Expose
    private String planGraceEndDate;
    @SerializedName("plan_id")
    @Expose
    private String planId;
    @SerializedName("plan_assign_date")
    @Expose
    private String planAssignDate;
    @SerializedName("plan_assign_history")
    @Expose
    private String planAssignHistory;
    @SerializedName("sms_userid")
    @Expose
    private String smsUserid;
    @SerializedName("sms_key")
    @Expose
    private String smsKey;
    @SerializedName("sms_senderid")
    @Expose
    private String smsSenderid;
    @SerializedName("sms_clientcode")
    @Expose
    private String smsClientcode;
    @SerializedName("referal_code")
    @Expose
    private String referalCode;
    @SerializedName("secret_key")
    @Expose
    private String secretKey;
    @SerializedName("society_name")
    @Expose
    private String societyName;
    @SerializedName("sch_account_manager")
    @Expose
    private String schAccountManager;
    @SerializedName("created_date_time")
    @Expose
    private String createdDateTime;
    @SerializedName("master_trainer_id")
    @Expose
    private Object masterTrainerId;
    @SerializedName("sch_date_establishment")
    @Expose
    private String schDateEstablishment;
    @SerializedName("UdfT1")
    @Expose
    private String udfT1;
    @SerializedName("UdfT2")
    @Expose
    private String udfT2;
    @SerializedName("UdfT3")
    @Expose
    private String udfT3;
    @SerializedName("UdfT4")
    @Expose
    private String udfT4;
    @SerializedName("UdfT5")
    @Expose
    private String udfT5;
    @SerializedName("UdfT6")
    @Expose
    private String udfT6;
    @SerializedName("UdfT7")
    @Expose
    private String udfT7;
    @SerializedName("UdfT8")
    @Expose
    private Object udfT8;

    public String getSsmSchoolid() {
        return ssmSchoolid;
    }

    public void setSsmSchoolid(String ssmSchoolid) {
        this.ssmSchoolid = ssmSchoolid;
    }

    public String getSchAdminId() {
        return schAdminId;
    }

    public void setSchAdminId(String schAdminId) {
        this.schAdminId = schAdminId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getSchCode() {
        return schCode;
    }

    public void setSchCode(String schCode) {
        this.schCode = schCode;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchEmail() {
        return schEmail;
    }

    public void setSchEmail(String schEmail) {
        this.schEmail = schEmail;
    }

    public String getSchContact() {
        return schContact;
    }

    public void setSchContact(String schContact) {
        this.schContact = schContact;
    }

    public String getSchStudentStrength() {
        return schStudentStrength;
    }

    public void setSchStudentStrength(String schStudentStrength) {
        this.schStudentStrength = schStudentStrength;
    }

    public String getSchCity() {
        return schCity;
    }

    public void setSchCity(String schCity) {
        this.schCity = schCity;
    }

    public String getSchDist() {
        return schDist;
    }

    public void setSchDist(String schDist) {
        this.schDist = schDist;
    }

    public String getSchTaluka() {
        return schTaluka;
    }

    public void setSchTaluka(String schTaluka) {
        this.schTaluka = schTaluka;
    }

    public String getSchVibhag() {
        return schVibhag;
    }

    public void setSchVibhag(String schVibhag) {
        this.schVibhag = schVibhag;
    }

    public String getSchProvince() {
        return schProvince;
    }

    public void setSchProvince(String schProvince) {
        this.schProvince = schProvince;
    }

    public String getSchState() {
        return schState;
    }

    public void setSchState(String schState) {
        this.schState = schState;
    }

    public String getSchPincode() {
        return schPincode;
    }

    public void setSchPincode(String schPincode) {
        this.schPincode = schPincode;
    }

    public String getSchAddress() {
        return schAddress;
    }

    public void setSchAddress(String schAddress) {
        this.schAddress = schAddress;
    }

    public String getSchCountry() {
        return schCountry;
    }

    public void setSchCountry(String schCountry) {
        this.schCountry = schCountry;
    }

    public String getSchDescription() {
        return schDescription;
    }

    public void setSchDescription(String schDescription) {
        this.schDescription = schDescription;
    }

    public String getSchImage() {
        return schImage;
    }

    public void setSchImage(String schImage) {
        this.schImage = schImage;
    }

    public String getEcrmCode() {
        return ecrmCode;
    }

    public void setEcrmCode(String ecrmCode) {
        this.ecrmCode = ecrmCode;
    }

    public String getSchModuleAcedamic() {
        return schModuleAcedamic;
    }

    public void setSchModuleAcedamic(String schModuleAcedamic) {
        this.schModuleAcedamic = schModuleAcedamic;
    }

    public String getSchModuleLibrary() {
        return schModuleLibrary;
    }

    public void setSchModuleLibrary(String schModuleLibrary) {
        this.schModuleLibrary = schModuleLibrary;
    }

    public String getSchModuleHostel() {
        return schModuleHostel;
    }

    public void setSchModuleHostel(String schModuleHostel) {
        this.schModuleHostel = schModuleHostel;
    }

    public String getSchModuleBus() {
        return schModuleBus;
    }

    public void setSchModuleBus(String schModuleBus) {
        this.schModuleBus = schModuleBus;
    }

    public String getSchModuleFood() {
        return schModuleFood;
    }

    public void setSchModuleFood(String schModuleFood) {
        this.schModuleFood = schModuleFood;
    }

    public String getSchModuleHR() {
        return schModuleHR;
    }

    public void setSchModuleHR(String schModuleHR) {
        this.schModuleHR = schModuleHR;
    }

    public String getSchModuleAppAdmin() {
        return schModuleAppAdmin;
    }

    public void setSchModuleAppAdmin(String schModuleAppAdmin) {
        this.schModuleAppAdmin = schModuleAppAdmin;
    }

    public String getSchModuleAppTeacher() {
        return schModuleAppTeacher;
    }

    public void setSchModuleAppTeacher(String schModuleAppTeacher) {
        this.schModuleAppTeacher = schModuleAppTeacher;
    }

    public String getSchModuleAppStd() {
        return schModuleAppStd;
    }

    public void setSchModuleAppStd(String schModuleAppStd) {
        this.schModuleAppStd = schModuleAppStd;
    }

    public String getSchExpiryDate() {
        return schExpiryDate;
    }

    public void setSchExpiryDate(String schExpiryDate) {
        this.schExpiryDate = schExpiryDate;
    }

    public String getSchStatus() {
        return schStatus;
    }

    public void setSchStatus(String schStatus) {
        this.schStatus = schStatus;
    }

    public String getSchRemarks() {
        return schRemarks;
    }

    public void setSchRemarks(String schRemarks) {
        this.schRemarks = schRemarks;
    }

    public String getServiesAvailed() {
        return serviesAvailed;
    }

    public void setServiesAvailed(String serviesAvailed) {
        this.serviesAvailed = serviesAvailed;
    }

    public String getPlanExpiryDate() {
        return planExpiryDate;
    }

    public void setPlanExpiryDate(String planExpiryDate) {
        this.planExpiryDate = planExpiryDate;
    }

    public String getPlanGraceEndDate() {
        return planGraceEndDate;
    }

    public void setPlanGraceEndDate(String planGraceEndDate) {
        this.planGraceEndDate = planGraceEndDate;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanAssignDate() {
        return planAssignDate;
    }

    public void setPlanAssignDate(String planAssignDate) {
        this.planAssignDate = planAssignDate;
    }

    public String getPlanAssignHistory() {
        return planAssignHistory;
    }

    public void setPlanAssignHistory(String planAssignHistory) {
        this.planAssignHistory = planAssignHistory;
    }

    public String getSmsUserid() {
        return smsUserid;
    }

    public void setSmsUserid(String smsUserid) {
        this.smsUserid = smsUserid;
    }

    public String getSmsKey() {
        return smsKey;
    }

    public void setSmsKey(String smsKey) {
        this.smsKey = smsKey;
    }

    public String getSmsSenderid() {
        return smsSenderid;
    }

    public void setSmsSenderid(String smsSenderid) {
        this.smsSenderid = smsSenderid;
    }

    public String getSmsClientcode() {
        return smsClientcode;
    }

    public void setSmsClientcode(String smsClientcode) {
        this.smsClientcode = smsClientcode;
    }

    public String getReferalCode() {
        return referalCode;
    }

    public void setReferalCode(String referalCode) {
        this.referalCode = referalCode;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getSchAccountManager() {
        return schAccountManager;
    }

    public void setSchAccountManager(String schAccountManager) {
        this.schAccountManager = schAccountManager;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Object getMasterTrainerId() {
        return masterTrainerId;
    }

    public void setMasterTrainerId(Object masterTrainerId) {
        this.masterTrainerId = masterTrainerId;
    }

    public String getSchDateEstablishment() {
        return schDateEstablishment;
    }

    public void setSchDateEstablishment(String schDateEstablishment) {
        this.schDateEstablishment = schDateEstablishment;
    }

    public String getUdfT1() {
        return udfT1;
    }

    public void setUdfT1(String udfT1) {
        this.udfT1 = udfT1;
    }

    public String getUdfT2() {
        return udfT2;
    }

    public void setUdfT2(String udfT2) {
        this.udfT2 = udfT2;
    }

    public String getUdfT3() {
        return udfT3;
    }

    public void setUdfT3(String udfT3) {
        this.udfT3 = udfT3;
    }

    public String getUdfT4() {
        return udfT4;
    }

    public void setUdfT4(String udfT4) {
        this.udfT4 = udfT4;
    }

    public String getUdfT5() {
        return udfT5;
    }

    public void setUdfT5(String udfT5) {
        this.udfT5 = udfT5;
    }

    public String getUdfT6() {
        return udfT6;
    }

    public void setUdfT6(String udfT6) {
        this.udfT6 = udfT6;
    }

    public String getUdfT7() {
        return udfT7;
    }

    public void setUdfT7(String udfT7) {
        this.udfT7 = udfT7;
    }

    public Object getUdfT8() {
        return udfT8;
    }

    public void setUdfT8(Object udfT8) {
        this.udfT8 = udfT8;
    }
}
