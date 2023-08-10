package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 氨基酸残基或者配体
 */
public class ResidueDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chain")

    private String chain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    public ResidueDto withChain(String chain) {
        this.chain = chain;
        return this;
    }

    /**
     * 氨基酸残基或者配体链的名称
     * @return chain
     */
    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public ResidueDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 氨基酸残基或者配体名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResidueDto withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 氨基酸残基或者配体的序列ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        ResidueDto that = (ResidueDto) obj;
        return Objects.equals(this.chain, that.chain) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chain, name, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResidueDto {\n");
        sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
