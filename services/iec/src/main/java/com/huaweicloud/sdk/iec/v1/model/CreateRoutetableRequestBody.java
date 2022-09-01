package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建路由表请求体
 */
public class CreateRoutetableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable")

    @JacksonXmlProperty(localName = "routetable")

    private CreateRoutetableOption routetable;

    public CreateRoutetableRequestBody withRoutetable(CreateRoutetableOption routetable) {
        this.routetable = routetable;
        return this;
    }

    public CreateRoutetableRequestBody withRoutetable(Consumer<CreateRoutetableOption> routetableSetter) {
        if (this.routetable == null) {
            this.routetable = new CreateRoutetableOption();
            routetableSetter.accept(this.routetable);
        }

        return this;
    }

    /**
     * Get routetable
     * @return routetable
     */
    public CreateRoutetableOption getRoutetable() {
        return routetable;
    }

    public void setRoutetable(CreateRoutetableOption routetable) {
        this.routetable = routetable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRoutetableRequestBody createRoutetableRequestBody = (CreateRoutetableRequestBody) o;
        return Objects.equals(this.routetable, createRoutetableRequestBody.routetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRoutetableRequestBody {\n");
        sb.append("    routetable: ").append(toIndentedString(routetable)).append("\n");
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
