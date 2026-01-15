package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询列信息请求体
 */
public class ShowColumnInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh")

    private Boolean refresh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_ids")

    private List<String> objectIds = null;

    public ShowColumnInfoReq withRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }

    /**
     * 是否重新从node获取列信息
     * @return refresh
     */
    public Boolean getRefresh() {
        return refresh;
    }

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    public ShowColumnInfoReq withObjectIds(List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }

    public ShowColumnInfoReq addObjectIdsItem(String objectIdsItem) {
        if (this.objectIds == null) {
            this.objectIds = new ArrayList<>();
        }
        this.objectIds.add(objectIdsItem);
        return this;
    }

    public ShowColumnInfoReq withObjectIds(Consumer<List<String>> objectIdsSetter) {
        if (this.objectIds == null) {
            this.objectIds = new ArrayList<>();
        }
        objectIdsSetter.accept(this.objectIds);
        return this;
    }

    /**
     * 列所属的对象信息
     * @return objectIds
     */
    public List<String> getObjectIds() {
        return objectIds;
    }

    public void setObjectIds(List<String> objectIds) {
        this.objectIds = objectIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowColumnInfoReq that = (ShowColumnInfoReq) obj;
        return Objects.equals(this.refresh, that.refresh) && Objects.equals(this.objectIds, that.objectIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refresh, objectIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowColumnInfoReq {\n");
        sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
        sb.append("    objectIds: ").append(toIndentedString(objectIds)).append("\n");
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
