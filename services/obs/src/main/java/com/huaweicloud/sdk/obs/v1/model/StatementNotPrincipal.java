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
 * 可选关键字，不被授权人，statement匹配除此之外的其他人。取值同Principal。  可选，NotPrincipal与Principal选其一。 
 */
@JacksonXmlRootElement(localName = "StatementNotPrincipal")
public class StatementNotPrincipal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ID")

    @JacksonXmlProperty(localName = "ID")
    private List<String> id = null;

    public StatementNotPrincipal withId(List<String> id) {
        this.id = id;
        return this;
    }

    public StatementNotPrincipal addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public StatementNotPrincipal withId(Consumer<List<String>> idSetter) {
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
        StatementNotPrincipal that = (StatementNotPrincipal) obj;
        return Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatementNotPrincipal {\n");
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
