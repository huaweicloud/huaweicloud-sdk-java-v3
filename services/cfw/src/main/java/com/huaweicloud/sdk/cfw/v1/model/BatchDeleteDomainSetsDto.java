package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteDomainSetsDto
 */
public class BatchDeleteDomainSetsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_ids")

    private List<String> setIds = null;

    public BatchDeleteDomainSetsDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public BatchDeleteDomainSetsDto withSetIds(List<String> setIds) {
        this.setIds = setIds;
        return this;
    }

    public BatchDeleteDomainSetsDto addSetIdsItem(String setIdsItem) {
        if (this.setIds == null) {
            this.setIds = new ArrayList<>();
        }
        this.setIds.add(setIdsItem);
        return this;
    }

    public BatchDeleteDomainSetsDto withSetIds(Consumer<List<String>> setIdsSetter) {
        if (this.setIds == null) {
            this.setIds = new ArrayList<>();
        }
        setIdsSetter.accept(this.setIds);
        return this;
    }

    /**
     * 域名组id
     * @return setIds
     */
    public List<String> getSetIds() {
        return setIds;
    }

    public void setSetIds(List<String> setIds) {
        this.setIds = setIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteDomainSetsDto that = (BatchDeleteDomainSetsDto) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.setIds, that.setIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, setIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDomainSetsDto {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    setIds: ").append(toIndentedString(setIds)).append("\n");
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
