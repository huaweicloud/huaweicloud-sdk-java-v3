package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteSearchCriterias
 */
public class DeleteSearchCriterias {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epsId")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public DeleteSearchCriterias withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public DeleteSearchCriterias withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 快速查询id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSearchCriterias deleteSearchCriterias = (DeleteSearchCriterias) o;
        return Objects.equals(this.epsId, deleteSearchCriterias.epsId)
            && Objects.equals(this.id, deleteSearchCriterias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSearchCriterias {\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
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
