package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScaleStoreData
 */
public class ScaleStoreData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_num")

    private Integer cuNum;

    public ScaleStoreData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScaleStoreData withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释：** 创建知识仓实例的任务id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ScaleStoreData withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称，region内唯一。 **约束限制：** 长度范围为3到63个字符，支持小写字母、数字、中划线（-），第一个字符只能够是小写字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ScaleStoreData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例状态。 **约束限制：** 不涉及。 **取值范围：** CREATING：创建中 NORMAL：正常 CREATED_FAILED：创建失败 ABNORMAL：异常 FROZEN：冻结 DISK_FULL：存储空间已满 DELETING：删除中 DELETE_FAILED：删除失败 SCALING：扩容中 SCALING_IN：缩容中 **默认取值:** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScaleStoreData withCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

    /**
     * **参数解释：** 扩容后cu规格的数量 **约束限制：** cu_num值要大于当前已有cu规格的数量 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return cuNum
     */
    public Integer getCuNum() {
        return cuNum;
    }

    public void setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleStoreData that = (ScaleStoreData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.storeName, that.storeName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.cuNum, that.cuNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobId, storeName, status, cuNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleStoreData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cuNum: ").append(toIndentedString(cuNum)).append("\n");
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
