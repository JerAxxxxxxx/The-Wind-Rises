package com.windrises.temp.entity.po;

import java.util.Date;

public class Users {
    private Long id;

    private String username;

    private String firstname;

    private String lastname;

    private String password;

    private Date lastvisit;

    private Date regdate;

    private Integer gender;

    private String idcard;

    private Integer age;

    private Boolean active;

    private String userActkey;

    private String securityHash;

    private Date updateTime;

    private Integer birthdaycalendar;

    private Date birthday;

    private String description;

    private String occupation;

    private Integer status;

    private Long departmentId;

    private Long roleId;

    private Long sequence;

    private Long sequenceno;

    private String initials;

    private Integer activeid;

    private String name;

    /**
    * 用户空间大小(默认 0 M)
    */
    private Integer userspacesize;

    /**
    * 用户空间数据id
    */
    private Long userspaceId;

    /**
    * 上一次用户空间大小
    */
    private Integer lastUserspacesize;

    /**
    * 上一次用户空间数据id
    */
    private Long lastUserspaceId;

    private Boolean modifyinitialpassword;

    private Integer linkboxdesktopshortcutenabled;

    private String linkboxdesktopshortcutname;

    private String secondDepartmentId;

    private String code;

    private String paixu;

    private String weixinopenid;

    private Integer maxuploadspeed;

    private Integer maxdownloadspeed;

    private String dingtalkopenid;

    private Integer validForever;

    private Date validEndTime;

    private String language;

    private Date updatePasswordTime;

    private Date syncdate;

    private Long clubunreadfilenum;

    private String anDeviceToken;

    private String iosDeviceToken;

    private Double nameScore;

    private Long lastExchange;

    /**
    * 用户最后我的公文文件时间
    */
    private Long lastOfficialDocument;

    /**
    * 账户类型：1-本地用户(默认) 2-AD域用户
    */
    private Short accountType;

    private String synckey;

    private String commfilesafemodesetup;

    private Long safemodesetupswitch;

    private Long myfilesafemodesetup;

    private String fileExchangeTargetusername;

    private Integer clientMyfileDriveEnabled;

    private Integer clientClubDriveEnabled;

    private Integer clientCommonfileDriveEnabled;

    private Long auditors;

    private Date previousVisitTime;

    private String indexSync;

    private String email;

    private String phone;

    private String telephone;

    private String weixin;

    private String qq;

    private String dingtalk;

    private String website;

    private String addres;

    private Integer cifsEnabled;

    private Date cifsEnabledDate;

    private Integer commonfileEnabled;

    private Date commonfileEnabledDate;

    private Integer userCifsOnline;

    private String lastIp;

    private String lastClient;

    private String lastOsName;

    private String jigou;

    private String wangdian;

    private Integer isoutsourcing;

    private Long lastSyncTime;

    private Long lastSyncTimeUp;

    private String parentName;

    private String dingtalkUserid;

    private Integer isOutlinkAuditor;

    private Integer isDefultAuditor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(Date lastvisit) {
        this.lastvisit = lastvisit;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUserActkey() {
        return userActkey;
    }

    public void setUserActkey(String userActkey) {
        this.userActkey = userActkey == null ? null : userActkey.trim();
    }

    public String getSecurityHash() {
        return securityHash;
    }

    public void setSecurityHash(String securityHash) {
        this.securityHash = securityHash == null ? null : securityHash.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBirthdaycalendar() {
        return birthdaycalendar;
    }

    public void setBirthdaycalendar(Integer birthdaycalendar) {
        this.birthdaycalendar = birthdaycalendar;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public Long getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(Long sequenceno) {
        this.sequenceno = sequenceno;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials == null ? null : initials.trim();
    }

    public Integer getActiveid() {
        return activeid;
    }

    public void setActiveid(Integer activeid) {
        this.activeid = activeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUserspacesize() {
        return userspacesize;
    }

    public void setUserspacesize(Integer userspacesize) {
        this.userspacesize = userspacesize;
    }

    public Long getUserspaceId() {
        return userspaceId;
    }

    public void setUserspaceId(Long userspaceId) {
        this.userspaceId = userspaceId;
    }

    public Integer getLastUserspacesize() {
        return lastUserspacesize;
    }

    public void setLastUserspacesize(Integer lastUserspacesize) {
        this.lastUserspacesize = lastUserspacesize;
    }

    public Long getLastUserspaceId() {
        return lastUserspaceId;
    }

    public void setLastUserspaceId(Long lastUserspaceId) {
        this.lastUserspaceId = lastUserspaceId;
    }

    public Boolean getModifyinitialpassword() {
        return modifyinitialpassword;
    }

    public void setModifyinitialpassword(Boolean modifyinitialpassword) {
        this.modifyinitialpassword = modifyinitialpassword;
    }

    public Integer getLinkboxdesktopshortcutenabled() {
        return linkboxdesktopshortcutenabled;
    }

    public void setLinkboxdesktopshortcutenabled(Integer linkboxdesktopshortcutenabled) {
        this.linkboxdesktopshortcutenabled = linkboxdesktopshortcutenabled;
    }

    public String getLinkboxdesktopshortcutname() {
        return linkboxdesktopshortcutname;
    }

    public void setLinkboxdesktopshortcutname(String linkboxdesktopshortcutname) {
        this.linkboxdesktopshortcutname = linkboxdesktopshortcutname == null ? null : linkboxdesktopshortcutname.trim();
    }

    public String getSecondDepartmentId() {
        return secondDepartmentId;
    }

    public void setSecondDepartmentId(String secondDepartmentId) {
        this.secondDepartmentId = secondDepartmentId == null ? null : secondDepartmentId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPaixu() {
        return paixu;
    }

    public void setPaixu(String paixu) {
        this.paixu = paixu == null ? null : paixu.trim();
    }

    public String getWeixinopenid() {
        return weixinopenid;
    }

    public void setWeixinopenid(String weixinopenid) {
        this.weixinopenid = weixinopenid == null ? null : weixinopenid.trim();
    }

    public Integer getMaxuploadspeed() {
        return maxuploadspeed;
    }

    public void setMaxuploadspeed(Integer maxuploadspeed) {
        this.maxuploadspeed = maxuploadspeed;
    }

    public Integer getMaxdownloadspeed() {
        return maxdownloadspeed;
    }

    public void setMaxdownloadspeed(Integer maxdownloadspeed) {
        this.maxdownloadspeed = maxdownloadspeed;
    }

    public String getDingtalkopenid() {
        return dingtalkopenid;
    }

    public void setDingtalkopenid(String dingtalkopenid) {
        this.dingtalkopenid = dingtalkopenid == null ? null : dingtalkopenid.trim();
    }

    public Integer getValidForever() {
        return validForever;
    }

    public void setValidForever(Integer validForever) {
        this.validForever = validForever;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Date getUpdatePasswordTime() {
        return updatePasswordTime;
    }

    public void setUpdatePasswordTime(Date updatePasswordTime) {
        this.updatePasswordTime = updatePasswordTime;
    }

    public Date getSyncdate() {
        return syncdate;
    }

    public void setSyncdate(Date syncdate) {
        this.syncdate = syncdate;
    }

    public Long getClubunreadfilenum() {
        return clubunreadfilenum;
    }

    public void setClubunreadfilenum(Long clubunreadfilenum) {
        this.clubunreadfilenum = clubunreadfilenum;
    }

    public String getAnDeviceToken() {
        return anDeviceToken;
    }

    public void setAnDeviceToken(String anDeviceToken) {
        this.anDeviceToken = anDeviceToken == null ? null : anDeviceToken.trim();
    }

    public String getIosDeviceToken() {
        return iosDeviceToken;
    }

    public void setIosDeviceToken(String iosDeviceToken) {
        this.iosDeviceToken = iosDeviceToken == null ? null : iosDeviceToken.trim();
    }

    public Double getNameScore() {
        return nameScore;
    }

    public void setNameScore(Double nameScore) {
        this.nameScore = nameScore;
    }

    public Long getLastExchange() {
        return lastExchange;
    }

    public void setLastExchange(Long lastExchange) {
        this.lastExchange = lastExchange;
    }

    public Long getLastOfficialDocument() {
        return lastOfficialDocument;
    }

    public void setLastOfficialDocument(Long lastOfficialDocument) {
        this.lastOfficialDocument = lastOfficialDocument;
    }

    public Short getAccountType() {
        return accountType;
    }

    public void setAccountType(Short accountType) {
        this.accountType = accountType;
    }

    public String getSynckey() {
        return synckey;
    }

    public void setSynckey(String synckey) {
        this.synckey = synckey == null ? null : synckey.trim();
    }

    public String getCommfilesafemodesetup() {
        return commfilesafemodesetup;
    }

    public void setCommfilesafemodesetup(String commfilesafemodesetup) {
        this.commfilesafemodesetup = commfilesafemodesetup == null ? null : commfilesafemodesetup.trim();
    }

    public Long getSafemodesetupswitch() {
        return safemodesetupswitch;
    }

    public void setSafemodesetupswitch(Long safemodesetupswitch) {
        this.safemodesetupswitch = safemodesetupswitch;
    }

    public Long getMyfilesafemodesetup() {
        return myfilesafemodesetup;
    }

    public void setMyfilesafemodesetup(Long myfilesafemodesetup) {
        this.myfilesafemodesetup = myfilesafemodesetup;
    }

    public String getFileExchangeTargetusername() {
        return fileExchangeTargetusername;
    }

    public void setFileExchangeTargetusername(String fileExchangeTargetusername) {
        this.fileExchangeTargetusername = fileExchangeTargetusername == null ? null : fileExchangeTargetusername.trim();
    }

    public Integer getClientMyfileDriveEnabled() {
        return clientMyfileDriveEnabled;
    }

    public void setClientMyfileDriveEnabled(Integer clientMyfileDriveEnabled) {
        this.clientMyfileDriveEnabled = clientMyfileDriveEnabled;
    }

    public Integer getClientClubDriveEnabled() {
        return clientClubDriveEnabled;
    }

    public void setClientClubDriveEnabled(Integer clientClubDriveEnabled) {
        this.clientClubDriveEnabled = clientClubDriveEnabled;
    }

    public Integer getClientCommonfileDriveEnabled() {
        return clientCommonfileDriveEnabled;
    }

    public void setClientCommonfileDriveEnabled(Integer clientCommonfileDriveEnabled) {
        this.clientCommonfileDriveEnabled = clientCommonfileDriveEnabled;
    }

    public Long getAuditors() {
        return auditors;
    }

    public void setAuditors(Long auditors) {
        this.auditors = auditors;
    }

    public Date getPreviousVisitTime() {
        return previousVisitTime;
    }

    public void setPreviousVisitTime(Date previousVisitTime) {
        this.previousVisitTime = previousVisitTime;
    }

    public String getIndexSync() {
        return indexSync;
    }

    public void setIndexSync(String indexSync) {
        this.indexSync = indexSync == null ? null : indexSync.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getDingtalk() {
        return dingtalk;
    }

    public void setDingtalk(String dingtalk) {
        this.dingtalk = dingtalk == null ? null : dingtalk.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres == null ? null : addres.trim();
    }

    public Integer getCifsEnabled() {
        return cifsEnabled;
    }

    public void setCifsEnabled(Integer cifsEnabled) {
        this.cifsEnabled = cifsEnabled;
    }

    public Date getCifsEnabledDate() {
        return cifsEnabledDate;
    }

    public void setCifsEnabledDate(Date cifsEnabledDate) {
        this.cifsEnabledDate = cifsEnabledDate;
    }

    public Integer getCommonfileEnabled() {
        return commonfileEnabled;
    }

    public void setCommonfileEnabled(Integer commonfileEnabled) {
        this.commonfileEnabled = commonfileEnabled;
    }

    public Date getCommonfileEnabledDate() {
        return commonfileEnabledDate;
    }

    public void setCommonfileEnabledDate(Date commonfileEnabledDate) {
        this.commonfileEnabledDate = commonfileEnabledDate;
    }

    public Integer getUserCifsOnline() {
        return userCifsOnline;
    }

    public void setUserCifsOnline(Integer userCifsOnline) {
        this.userCifsOnline = userCifsOnline;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public String getLastClient() {
        return lastClient;
    }

    public void setLastClient(String lastClient) {
        this.lastClient = lastClient == null ? null : lastClient.trim();
    }

    public String getLastOsName() {
        return lastOsName;
    }

    public void setLastOsName(String lastOsName) {
        this.lastOsName = lastOsName == null ? null : lastOsName.trim();
    }

    public String getJigou() {
        return jigou;
    }

    public void setJigou(String jigou) {
        this.jigou = jigou == null ? null : jigou.trim();
    }

    public String getWangdian() {
        return wangdian;
    }

    public void setWangdian(String wangdian) {
        this.wangdian = wangdian == null ? null : wangdian.trim();
    }

    public Integer getIsoutsourcing() {
        return isoutsourcing;
    }

    public void setIsoutsourcing(Integer isoutsourcing) {
        this.isoutsourcing = isoutsourcing;
    }

    public Long getLastSyncTime() {
        return lastSyncTime;
    }

    public void setLastSyncTime(Long lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    public Long getLastSyncTimeUp() {
        return lastSyncTimeUp;
    }

    public void setLastSyncTimeUp(Long lastSyncTimeUp) {
        this.lastSyncTimeUp = lastSyncTimeUp;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public String getDingtalkUserid() {
        return dingtalkUserid;
    }

    public void setDingtalkUserid(String dingtalkUserid) {
        this.dingtalkUserid = dingtalkUserid == null ? null : dingtalkUserid.trim();
    }

    public Integer getIsOutlinkAuditor() {
        return isOutlinkAuditor;
    }

    public void setIsOutlinkAuditor(Integer isOutlinkAuditor) {
        this.isOutlinkAuditor = isOutlinkAuditor;
    }

    public Integer getIsDefultAuditor() {
        return isDefultAuditor;
    }

    public void setIsDefultAuditor(Integer isDefultAuditor) {
        this.isDefultAuditor = isDefultAuditor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", password=").append(password);
        sb.append(", lastvisit=").append(lastvisit);
        sb.append(", regdate=").append(regdate);
        sb.append(", gender=").append(gender);
        sb.append(", idcard=").append(idcard);
        sb.append(", age=").append(age);
        sb.append(", active=").append(active);
        sb.append(", userActkey=").append(userActkey);
        sb.append(", securityHash=").append(securityHash);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", birthdaycalendar=").append(birthdaycalendar);
        sb.append(", birthday=").append(birthday);
        sb.append(", description=").append(description);
        sb.append(", occupation=").append(occupation);
        sb.append(", status=").append(status);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", roleId=").append(roleId);
        sb.append(", sequence=").append(sequence);
        sb.append(", sequenceno=").append(sequenceno);
        sb.append(", initials=").append(initials);
        sb.append(", activeid=").append(activeid);
        sb.append(", name=").append(name);
        sb.append(", userspacesize=").append(userspacesize);
        sb.append(", userspaceId=").append(userspaceId);
        sb.append(", lastUserspacesize=").append(lastUserspacesize);
        sb.append(", lastUserspaceId=").append(lastUserspaceId);
        sb.append(", modifyinitialpassword=").append(modifyinitialpassword);
        sb.append(", linkboxdesktopshortcutenabled=").append(linkboxdesktopshortcutenabled);
        sb.append(", linkboxdesktopshortcutname=").append(linkboxdesktopshortcutname);
        sb.append(", secondDepartmentId=").append(secondDepartmentId);
        sb.append(", code=").append(code);
        sb.append(", paixu=").append(paixu);
        sb.append(", weixinopenid=").append(weixinopenid);
        sb.append(", maxuploadspeed=").append(maxuploadspeed);
        sb.append(", maxdownloadspeed=").append(maxdownloadspeed);
        sb.append(", dingtalkopenid=").append(dingtalkopenid);
        sb.append(", validForever=").append(validForever);
        sb.append(", validEndTime=").append(validEndTime);
        sb.append(", language=").append(language);
        sb.append(", updatePasswordTime=").append(updatePasswordTime);
        sb.append(", syncdate=").append(syncdate);
        sb.append(", clubunreadfilenum=").append(clubunreadfilenum);
        sb.append(", anDeviceToken=").append(anDeviceToken);
        sb.append(", iosDeviceToken=").append(iosDeviceToken);
        sb.append(", nameScore=").append(nameScore);
        sb.append(", lastExchange=").append(lastExchange);
        sb.append(", lastOfficialDocument=").append(lastOfficialDocument);
        sb.append(", accountType=").append(accountType);
        sb.append(", synckey=").append(synckey);
        sb.append(", commfilesafemodesetup=").append(commfilesafemodesetup);
        sb.append(", safemodesetupswitch=").append(safemodesetupswitch);
        sb.append(", myfilesafemodesetup=").append(myfilesafemodesetup);
        sb.append(", fileExchangeTargetusername=").append(fileExchangeTargetusername);
        sb.append(", clientMyfileDriveEnabled=").append(clientMyfileDriveEnabled);
        sb.append(", clientClubDriveEnabled=").append(clientClubDriveEnabled);
        sb.append(", clientCommonfileDriveEnabled=").append(clientCommonfileDriveEnabled);
        sb.append(", auditors=").append(auditors);
        sb.append(", previousVisitTime=").append(previousVisitTime);
        sb.append(", indexSync=").append(indexSync);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", telephone=").append(telephone);
        sb.append(", weixin=").append(weixin);
        sb.append(", qq=").append(qq);
        sb.append(", dingtalk=").append(dingtalk);
        sb.append(", website=").append(website);
        sb.append(", addres=").append(addres);
        sb.append(", cifsEnabled=").append(cifsEnabled);
        sb.append(", cifsEnabledDate=").append(cifsEnabledDate);
        sb.append(", commonfileEnabled=").append(commonfileEnabled);
        sb.append(", commonfileEnabledDate=").append(commonfileEnabledDate);
        sb.append(", userCifsOnline=").append(userCifsOnline);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", lastClient=").append(lastClient);
        sb.append(", lastOsName=").append(lastOsName);
        sb.append(", jigou=").append(jigou);
        sb.append(", wangdian=").append(wangdian);
        sb.append(", isoutsourcing=").append(isoutsourcing);
        sb.append(", lastSyncTime=").append(lastSyncTime);
        sb.append(", lastSyncTimeUp=").append(lastSyncTimeUp);
        sb.append(", parentName=").append(parentName);
        sb.append(", dingtalkUserid=").append(dingtalkUserid);
        sb.append(", isOutlinkAuditor=").append(isOutlinkAuditor);
        sb.append(", isDefultAuditor=").append(isDefultAuditor);
        sb.append("]");
        return sb.toString();
    }
}