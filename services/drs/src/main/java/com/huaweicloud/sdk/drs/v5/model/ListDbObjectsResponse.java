package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDbObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_root_db")

    private TargetRootDb targetRootDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_info")

    private Map<String, DatabaseObject> objectInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_table_num")

    private Integer maxTableNum;

    public ListDbObjectsResponse withTargetRootDb(TargetRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
        return this;
    }

    public ListDbObjectsResponse withTargetRootDb(Consumer<TargetRootDb> targetRootDbSetter) {
        if (this.targetRootDb == null) {
            this.targetRootDb = new TargetRootDb();
            targetRootDbSetter.accept(this.targetRootDb);
        }

        return this;
    }

    /**
     * Get targetRootDb
     * @return targetRootDb
     */
    public TargetRootDb getTargetRootDb() {
        return targetRootDb;
    }

    public void setTargetRootDb(TargetRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
    }

    public ListDbObjectsResponse withObjectInfo(Map<String, DatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
        return this;
    }

    public ListDbObjectsResponse putObjectInfoItem(String key, DatabaseObject objectInfoItem) {
        if (this.objectInfo == null) {
            this.objectInfo = new HashMap<>();
        }
        this.objectInfo.put(key, objectInfoItem);
        return this;
    }

    public ListDbObjectsResponse withObjectInfo(Consumer<Map<String, DatabaseObject>> objectInfoSetter) {
        if (this.objectInfo == null) {
            this.objectInfo = new HashMap<>();
        }
        objectInfoSetter.accept(this.objectInfo);
        return this;
    }

    /**
     * 数据库对象迁移或同步信息。
     * @return objectInfo
     */
    public Map<String, DatabaseObject> getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(Map<String, DatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
    }

    public ListDbObjectsResponse withMaxTableNum(Integer maxTableNum) {
        this.maxTableNum = maxTableNum;
        return this;
    }

    /**
     * 库下表数量的阈值。
     * @return maxTableNum
     */
    public Integer getMaxTableNum() {
        return maxTableNum;
    }

    public void setMaxTableNum(Integer maxTableNum) {
        this.maxTableNum = maxTableNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDbObjectsResponse listDbObjectsResponse = (ListDbObjectsResponse) o;
        return Objects.equals(this.targetRootDb, listDbObjectsResponse.targetRootDb)
            && Objects.equals(this.objectInfo, listDbObjectsResponse.objectInfo)
            && Objects.equals(this.maxTableNum, listDbObjectsResponse.maxTableNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetRootDb, objectInfo, maxTableNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbObjectsResponse {\n");
        sb.append("    targetRootDb: ").append(toIndentedString(targetRootDb)).append("\n");
        sb.append("    objectInfo: ").append(toIndentedString(objectInfo)).append("\n");
        sb.append("    maxTableNum: ").append(toIndentedString(maxTableNum)).append("\n");
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
