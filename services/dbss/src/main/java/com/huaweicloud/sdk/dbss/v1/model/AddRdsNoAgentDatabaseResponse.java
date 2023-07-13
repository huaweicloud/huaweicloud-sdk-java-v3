package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddRdsNoAgentDatabaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "illegal_db_id")

    private List<String> illegalDbId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legal_db_id")

    private List<String> legalDbId = null;

    public AddRdsNoAgentDatabaseResponse withIllegalDbId(List<String> illegalDbId) {
        this.illegalDbId = illegalDbId;
        return this;
    }

    public AddRdsNoAgentDatabaseResponse addIllegalDbIdItem(String illegalDbIdItem) {
        if (this.illegalDbId == null) {
            this.illegalDbId = new ArrayList<>();
        }
        this.illegalDbId.add(illegalDbIdItem);
        return this;
    }

    public AddRdsNoAgentDatabaseResponse withIllegalDbId(Consumer<List<String>> illegalDbIdSetter) {
        if (this.illegalDbId == null) {
            this.illegalDbId = new ArrayList<>();
        }
        illegalDbIdSetter.accept(this.illegalDbId);
        return this;
    }

    /**
     * 添加失败的数据库实例id
     * @return illegalDbId
     */
    public List<String> getIllegalDbId() {
        return illegalDbId;
    }

    public void setIllegalDbId(List<String> illegalDbId) {
        this.illegalDbId = illegalDbId;
    }

    public AddRdsNoAgentDatabaseResponse withLegalDbId(List<String> legalDbId) {
        this.legalDbId = legalDbId;
        return this;
    }

    public AddRdsNoAgentDatabaseResponse addLegalDbIdItem(String legalDbIdItem) {
        if (this.legalDbId == null) {
            this.legalDbId = new ArrayList<>();
        }
        this.legalDbId.add(legalDbIdItem);
        return this;
    }

    public AddRdsNoAgentDatabaseResponse withLegalDbId(Consumer<List<String>> legalDbIdSetter) {
        if (this.legalDbId == null) {
            this.legalDbId = new ArrayList<>();
        }
        legalDbIdSetter.accept(this.legalDbId);
        return this;
    }

    /**
     * 添加成功的数据库实例id
     * @return legalDbId
     */
    public List<String> getLegalDbId() {
        return legalDbId;
    }

    public void setLegalDbId(List<String> legalDbId) {
        this.legalDbId = legalDbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddRdsNoAgentDatabaseResponse that = (AddRdsNoAgentDatabaseResponse) obj;
        return Objects.equals(this.illegalDbId, that.illegalDbId) && Objects.equals(this.legalDbId, that.legalDbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(illegalDbId, legalDbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRdsNoAgentDatabaseResponse {\n");
        sb.append("    illegalDbId: ").append(toIndentedString(illegalDbId)).append("\n");
        sb.append("    legalDbId: ").append(toIndentedString(legalDbId)).append("\n");
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
