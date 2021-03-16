package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改规则触发条件请求结构体
 */
public class UpdateRuleReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_name")
    
    private String ruleName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="select")
    
    private String select;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="where")
    
    private String where;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active")
    
    private Boolean active;

    public UpdateRuleReq withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    


    /**
     * 用户自定义的规则名称。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    

    public UpdateRuleReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 用户自定义的规则描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateRuleReq withSelect(String select) {
        this.select = select;
        return this;
    }

    


    /**
     * 用户自定义sql select语句，最大长度500，更新sql时，select跟where必须同时传参，如果需要清除该参数的值，输入空字符串，该参数仅供标准版和企业版用户使用。
     * @return select
     */
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    

    public UpdateRuleReq withWhere(String where) {
        this.where = where;
        return this;
    }

    


    /**
     * 用户自定义sql where语句，最大长度500，更新操作时，select跟where必须同时传参，如果需要清除该参数的值，输入空字符串，该参数仅供标准版和企业版用户使用。
     * @return where
     */
    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    

    public UpdateRuleReq withActive(Boolean active) {
        this.active = active;
        return this;
    }

    


    /**
     * 修改规则条件的状态是否为激活。
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRuleReq updateRuleReq = (UpdateRuleReq) o;
        return Objects.equals(this.ruleName, updateRuleReq.ruleName) &&
            Objects.equals(this.description, updateRuleReq.description) &&
            Objects.equals(this.select, updateRuleReq.select) &&
            Objects.equals(this.where, updateRuleReq.where) &&
            Objects.equals(this.active, updateRuleReq.active);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, select, where, active);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleReq {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    select: ").append(toIndentedString(select)).append("\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

