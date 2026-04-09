package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可选关键字，被授权人，指定本条statement权限针对的Domain以及User，支持通配符“*”，表示所有用户。当对Domain下所有用户授权时，Principal格式为domain/domainid:user/_*。当对某个User进行授权时，Principal格式为domain/domainid:user/userId或者domain/domainid:user/userName。  如果通过控制台进行桶清单配置，控制台会自动生成目标桶的桶策略。目标桶的桶策略中Principal取值则固定为{\&quot;Service\&quot;: \&quot;obs\&quot;}。关于桶清单的详细介绍请参见[桶清单说明](https://support.huaweicloud.com/ugobs-obs/obs_41_0044.html)。  可选，Principal与NotPrincipal选其一。 
 */
@JacksonXmlRootElement(localName = "StatementPrincipal")
public class StatementPrincipal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ID")

    @JacksonXmlProperty(localName = "ID")
    private List<String> id = null;

    public StatementPrincipal withId(List<String> id) {
        this.id = id;
        return this;
    }

    public StatementPrincipal addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public StatementPrincipal withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * OBS支持的Principal或NotPrincipal有匿名用户、特定租户、特定用户、联合身份用户，委托用户。 
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatementPrincipal that = (StatementPrincipal) obj;
        return Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatementPrincipal {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
