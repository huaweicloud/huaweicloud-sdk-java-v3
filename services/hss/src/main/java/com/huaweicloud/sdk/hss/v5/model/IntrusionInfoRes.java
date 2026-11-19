package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 入侵信息
 */
public class IntrusionInfoRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_account_info_list")

    private List<Object> riskyAccountInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_login_info_list")

    private List<Object> abnormalLoginInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_program_info_list")

    private List<Object> maliciousProgramInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webshell_info_list")

    private List<Object> webshellInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_crack_info_list")

    private List<Object> accountCrackInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_file_change_info_list")

    private List<Object> criticalFileChangeInfoList = null;

    public IntrusionInfoRes withRiskyAccountInfoList(List<Object> riskyAccountInfoList) {
        this.riskyAccountInfoList = riskyAccountInfoList;
        return this;
    }

    public IntrusionInfoRes addRiskyAccountInfoListItem(Object riskyAccountInfoListItem) {
        if (this.riskyAccountInfoList == null) {
            this.riskyAccountInfoList = new ArrayList<>();
        }
        this.riskyAccountInfoList.add(riskyAccountInfoListItem);
        return this;
    }

    public IntrusionInfoRes withRiskyAccountInfoList(Consumer<List<Object>> riskyAccountInfoListSetter) {
        if (this.riskyAccountInfoList == null) {
            this.riskyAccountInfoList = new ArrayList<>();
        }
        riskyAccountInfoListSetter.accept(this.riskyAccountInfoList);
        return this;
    }

    /**
     * **参数解释**： 风险账号列表 **取值范围**： 0-200个RiskyAccountInfo对象 
     * @return riskyAccountInfoList
     */
    public List<Object> getRiskyAccountInfoList() {
        return riskyAccountInfoList;
    }

    public void setRiskyAccountInfoList(List<Object> riskyAccountInfoList) {
        this.riskyAccountInfoList = riskyAccountInfoList;
    }

    public IntrusionInfoRes withAbnormalLoginInfoList(List<Object> abnormalLoginInfoList) {
        this.abnormalLoginInfoList = abnormalLoginInfoList;
        return this;
    }

    public IntrusionInfoRes addAbnormalLoginInfoListItem(Object abnormalLoginInfoListItem) {
        if (this.abnormalLoginInfoList == null) {
            this.abnormalLoginInfoList = new ArrayList<>();
        }
        this.abnormalLoginInfoList.add(abnormalLoginInfoListItem);
        return this;
    }

    public IntrusionInfoRes withAbnormalLoginInfoList(Consumer<List<Object>> abnormalLoginInfoListSetter) {
        if (this.abnormalLoginInfoList == null) {
            this.abnormalLoginInfoList = new ArrayList<>();
        }
        abnormalLoginInfoListSetter.accept(this.abnormalLoginInfoList);
        return this;
    }

    /**
     * **参数解释**： 异地登录列表 **取值范围**： 0-200个AbnormalLoginInfo对象 
     * @return abnormalLoginInfoList
     */
    public List<Object> getAbnormalLoginInfoList() {
        return abnormalLoginInfoList;
    }

    public void setAbnormalLoginInfoList(List<Object> abnormalLoginInfoList) {
        this.abnormalLoginInfoList = abnormalLoginInfoList;
    }

    public IntrusionInfoRes withMaliciousProgramInfoList(List<Object> maliciousProgramInfoList) {
        this.maliciousProgramInfoList = maliciousProgramInfoList;
        return this;
    }

    public IntrusionInfoRes addMaliciousProgramInfoListItem(Object maliciousProgramInfoListItem) {
        if (this.maliciousProgramInfoList == null) {
            this.maliciousProgramInfoList = new ArrayList<>();
        }
        this.maliciousProgramInfoList.add(maliciousProgramInfoListItem);
        return this;
    }

    public IntrusionInfoRes withMaliciousProgramInfoList(Consumer<List<Object>> maliciousProgramInfoListSetter) {
        if (this.maliciousProgramInfoList == null) {
            this.maliciousProgramInfoList = new ArrayList<>();
        }
        maliciousProgramInfoListSetter.accept(this.maliciousProgramInfoList);
        return this;
    }

    /**
     * **参数解释**： 恶意程序列表 **取值范围**： 0-200个MaliciousProgramInfo对象 
     * @return maliciousProgramInfoList
     */
    public List<Object> getMaliciousProgramInfoList() {
        return maliciousProgramInfoList;
    }

    public void setMaliciousProgramInfoList(List<Object> maliciousProgramInfoList) {
        this.maliciousProgramInfoList = maliciousProgramInfoList;
    }

    public IntrusionInfoRes withWebshellInfoList(List<Object> webshellInfoList) {
        this.webshellInfoList = webshellInfoList;
        return this;
    }

    public IntrusionInfoRes addWebshellInfoListItem(Object webshellInfoListItem) {
        if (this.webshellInfoList == null) {
            this.webshellInfoList = new ArrayList<>();
        }
        this.webshellInfoList.add(webshellInfoListItem);
        return this;
    }

    public IntrusionInfoRes withWebshellInfoList(Consumer<List<Object>> webshellInfoListSetter) {
        if (this.webshellInfoList == null) {
            this.webshellInfoList = new ArrayList<>();
        }
        webshellInfoListSetter.accept(this.webshellInfoList);
        return this;
    }

    /**
     * **参数解释**： 网站后门列表 **取值范围**： 0-200个WebshellInfo对象 
     * @return webshellInfoList
     */
    public List<Object> getWebshellInfoList() {
        return webshellInfoList;
    }

    public void setWebshellInfoList(List<Object> webshellInfoList) {
        this.webshellInfoList = webshellInfoList;
    }

    public IntrusionInfoRes withAccountCrackInfoList(List<Object> accountCrackInfoList) {
        this.accountCrackInfoList = accountCrackInfoList;
        return this;
    }

    public IntrusionInfoRes addAccountCrackInfoListItem(Object accountCrackInfoListItem) {
        if (this.accountCrackInfoList == null) {
            this.accountCrackInfoList = new ArrayList<>();
        }
        this.accountCrackInfoList.add(accountCrackInfoListItem);
        return this;
    }

    public IntrusionInfoRes withAccountCrackInfoList(Consumer<List<Object>> accountCrackInfoListSetter) {
        if (this.accountCrackInfoList == null) {
            this.accountCrackInfoList = new ArrayList<>();
        }
        accountCrackInfoListSetter.accept(this.accountCrackInfoList);
        return this;
    }

    /**
     * **参数解释**： 账号破解列表 **取值范围**： 0-200个AccountCrackInfo对象 
     * @return accountCrackInfoList
     */
    public List<Object> getAccountCrackInfoList() {
        return accountCrackInfoList;
    }

    public void setAccountCrackInfoList(List<Object> accountCrackInfoList) {
        this.accountCrackInfoList = accountCrackInfoList;
    }

    public IntrusionInfoRes withCriticalFileChangeInfoList(List<Object> criticalFileChangeInfoList) {
        this.criticalFileChangeInfoList = criticalFileChangeInfoList;
        return this;
    }

    public IntrusionInfoRes addCriticalFileChangeInfoListItem(Object criticalFileChangeInfoListItem) {
        if (this.criticalFileChangeInfoList == null) {
            this.criticalFileChangeInfoList = new ArrayList<>();
        }
        this.criticalFileChangeInfoList.add(criticalFileChangeInfoListItem);
        return this;
    }

    public IntrusionInfoRes withCriticalFileChangeInfoList(Consumer<List<Object>> criticalFileChangeInfoListSetter) {
        if (this.criticalFileChangeInfoList == null) {
            this.criticalFileChangeInfoList = new ArrayList<>();
        }
        criticalFileChangeInfoListSetter.accept(this.criticalFileChangeInfoList);
        return this;
    }

    /**
     * **参数解释**： 关键文件变更列表 **取值范围**： 0-200个CriticalFileChangeInfo对象 
     * @return criticalFileChangeInfoList
     */
    public List<Object> getCriticalFileChangeInfoList() {
        return criticalFileChangeInfoList;
    }

    public void setCriticalFileChangeInfoList(List<Object> criticalFileChangeInfoList) {
        this.criticalFileChangeInfoList = criticalFileChangeInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntrusionInfoRes that = (IntrusionInfoRes) obj;
        return Objects.equals(this.riskyAccountInfoList, that.riskyAccountInfoList)
            && Objects.equals(this.abnormalLoginInfoList, that.abnormalLoginInfoList)
            && Objects.equals(this.maliciousProgramInfoList, that.maliciousProgramInfoList)
            && Objects.equals(this.webshellInfoList, that.webshellInfoList)
            && Objects.equals(this.accountCrackInfoList, that.accountCrackInfoList)
            && Objects.equals(this.criticalFileChangeInfoList, that.criticalFileChangeInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskyAccountInfoList,
            abnormalLoginInfoList,
            maliciousProgramInfoList,
            webshellInfoList,
            accountCrackInfoList,
            criticalFileChangeInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntrusionInfoRes {\n");
        sb.append("    riskyAccountInfoList: ").append(toIndentedString(riskyAccountInfoList)).append("\n");
        sb.append("    abnormalLoginInfoList: ").append(toIndentedString(abnormalLoginInfoList)).append("\n");
        sb.append("    maliciousProgramInfoList: ").append(toIndentedString(maliciousProgramInfoList)).append("\n");
        sb.append("    webshellInfoList: ").append(toIndentedString(webshellInfoList)).append("\n");
        sb.append("    accountCrackInfoList: ").append(toIndentedString(accountCrackInfoList)).append("\n");
        sb.append("    criticalFileChangeInfoList: ").append(toIndentedString(criticalFileChangeInfoList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
