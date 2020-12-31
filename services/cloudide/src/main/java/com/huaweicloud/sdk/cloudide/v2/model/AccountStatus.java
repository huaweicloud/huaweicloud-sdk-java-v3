package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccountStatus
 */
public class AccountStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cur_org_create_role")
    
    private Boolean curOrgCreateRole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cur_org_open")
    
    private Boolean curOrgOpen;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="has_free_trial")
    
    private Boolean hasFreeTrial;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="show_manage")
    
    private Boolean showManage;

    public AccountStatus withCurOrgCreateRole(Boolean curOrgCreateRole) {
        this.curOrgCreateRole = curOrgCreateRole;
        return this;
    }

    


    /**
     * 是否有创建实例权限
     * @return curOrgCreateRole
     */
    public Boolean getCurOrgCreateRole() {
        return curOrgCreateRole;
    }

    public void setCurOrgCreateRole(Boolean curOrgCreateRole) {
        this.curOrgCreateRole = curOrgCreateRole;
    }

    public AccountStatus withCurOrgOpen(Boolean curOrgOpen) {
        this.curOrgOpen = curOrgOpen;
        return this;
    }

    


    /**
     * 账号所属租户是否开通服务
     * @return curOrgOpen
     */
    public Boolean getCurOrgOpen() {
        return curOrgOpen;
    }

    public void setCurOrgOpen(Boolean curOrgOpen) {
        this.curOrgOpen = curOrgOpen;
    }

    public AccountStatus withHasFreeTrial(Boolean hasFreeTrial) {
        this.hasFreeTrial = hasFreeTrial;
        return this;
    }

    


    /**
     * 免费试用
     * @return hasFreeTrial
     */
    public Boolean getHasFreeTrial() {
        return hasFreeTrial;
    }

    public void setHasFreeTrial(Boolean hasFreeTrial) {
        this.hasFreeTrial = hasFreeTrial;
    }

    public AccountStatus withShowManage(Boolean showManage) {
        this.showManage = showManage;
        return this;
    }

    


    /**
     * 是否有管理入口的权限
     * @return showManage
     */
    public Boolean getShowManage() {
        return showManage;
    }

    public void setShowManage(Boolean showManage) {
        this.showManage = showManage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountStatus accountStatus = (AccountStatus) o;
        return Objects.equals(this.curOrgCreateRole, accountStatus.curOrgCreateRole) &&
            Objects.equals(this.curOrgOpen, accountStatus.curOrgOpen) &&
            Objects.equals(this.hasFreeTrial, accountStatus.hasFreeTrial) &&
            Objects.equals(this.showManage, accountStatus.showManage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(curOrgCreateRole, curOrgOpen, hasFreeTrial, showManage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountStatus {\n");
        sb.append("    curOrgCreateRole: ").append(toIndentedString(curOrgCreateRole)).append("\n");
        sb.append("    curOrgOpen: ").append(toIndentedString(curOrgOpen)).append("\n");
        sb.append("    hasFreeTrial: ").append(toIndentedString(hasFreeTrial)).append("\n");
        sb.append("    showManage: ").append(toIndentedString(showManage)).append("\n");
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

