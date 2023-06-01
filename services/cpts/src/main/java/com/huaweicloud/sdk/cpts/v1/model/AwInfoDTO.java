package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AwInfoDTO
 */
public class AwInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datumType")

    private Integer datumType;

    public AwInfoDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * aw名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AwInfoDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库中dc_case_aw表中的主键ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AwInfoDTO withDatumType(Integer datumType) {
        this.datumType = datumType;
        return this;
    }

    /**
     * 数据类型（用例/aw/事务）
     * minimum: 0
     * maximum: 1024
     * @return datumType
     */
    public Integer getDatumType() {
        return datumType;
    }

    public void setDatumType(Integer datumType) {
        this.datumType = datumType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AwInfoDTO awInfoDTO = (AwInfoDTO) o;
        return Objects.equals(this.name, awInfoDTO.name) && Objects.equals(this.id, awInfoDTO.id)
            && Objects.equals(this.datumType, awInfoDTO.datumType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, datumType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AwInfoDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    datumType: ").append(toIndentedString(datumType)).append("\n");
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
