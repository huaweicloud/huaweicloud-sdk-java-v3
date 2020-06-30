package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CorpAdminDTO
 */
public class CorpAdminDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account")
    
    private String account;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="menuTemplateId")
    
    private String menuTemplateId;

    public CorpAdminDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    


    /**
     * 企业用户账号。 maxLength：64 minLength：1
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public CorpAdminDTO withMenuTemplateId(String menuTemplateId) {
        this.menuTemplateId = menuTemplateId;
        return this;
    }

    


    /**
     * 菜单模板id，若不携带或为\\\"\\\"，则使用默认的菜单模板  约束 - 长度范围为0到32个字符
     * @return menuTemplateId
     */
    public String getMenuTemplateId() {
        return menuTemplateId;
    }

    public void setMenuTemplateId(String menuTemplateId) {
        this.menuTemplateId = menuTemplateId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorpAdminDTO corpAdminDTO = (CorpAdminDTO) o;
        return Objects.equals(this.account, corpAdminDTO.account) &&
            Objects.equals(this.menuTemplateId, corpAdminDTO.menuTemplateId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(account, menuTemplateId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorpAdminDTO {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    menuTemplateId: ").append(toIndentedString(menuTemplateId)).append("\n");
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

