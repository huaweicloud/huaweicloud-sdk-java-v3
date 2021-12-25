package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CheckAssetJobStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /** 作业类型 */
    public static final class TypeEnum {

        /** Enum IMPORTASSET for value: "importAsset" */
        public static final TypeEnum IMPORTASSET = new TypeEnum("importAsset");

        /** Enum EXPORTASSET for value: "exportAsset" */
        public static final TypeEnum EXPORTASSET = new TypeEnum("exportAsset");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("importAsset", IMPORTASSET);
            map.put("exportAsset", EXPORTASSET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /** 作业状态 - Running : 作业正在执行 - Success : 作业执行成功，对于导出作业，用户可以通过archive_id来下载资产包 - Failed : 作业执行失败，通过reason字段查看具体错误原因 -
     * Finished : 作业完成，针对导出作业，如果在有效期内下载了资产包，则作业状态从Success转换到Finished，此时不再返回archive_id字段 */
    public static final class StatusEnum {

        /** Enum RUNNING for value: "Running" */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /** Enum SUCCESS for value: "Success" */
        public static final StatusEnum SUCCESS = new StatusEnum("Success");

        /** Enum FAILED for value: "Failed" */
        public static final StatusEnum FAILED = new StatusEnum("Failed");

        /** Enum FINISHED for value: "finished" */
        public static final StatusEnum FINISHED = new StatusEnum("finished");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Running", RUNNING);
            map.put("Success", SUCCESS);
            map.put("Failed", FAILED);
            map.put("finished", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reasons")

    private List<AssetJobReason> reasons = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress_percent")

    private Float progressPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_id")

    private String archiveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public CheckAssetJobStatusResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 作业ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckAssetJobStatusResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 作业类型
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CheckAssetJobStatusResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 作业状态 - Running : 作业正在执行 - Success : 作业执行成功，对于导出作业，用户可以通过archive_id来下载资产包 - Failed : 作业执行失败，通过reason字段查看具体错误原因 -
     * Finished : 作业完成，针对导出作业，如果在有效期内下载了资产包，则作业状态从Success转换到Finished，此时不再返回archive_id字段
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CheckAssetJobStatusResponse withReasons(List<AssetJobReason> reasons) {
        this.reasons = reasons;
        return this;
    }

    public CheckAssetJobStatusResponse addReasonsItem(AssetJobReason reasonsItem) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<>();
        }
        this.reasons.add(reasonsItem);
        return this;
    }

    public CheckAssetJobStatusResponse withReasons(Consumer<List<AssetJobReason>> reasonsSetter) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<>();
        }
        reasonsSetter.accept(this.reasons);
        return this;
    }

    /** 导致作业失败的错误原因
     * 
     * @return reasons */
    public List<AssetJobReason> getReasons() {
        return reasons;
    }

    public void setReasons(List<AssetJobReason> reasons) {
        this.reasons = reasons;
    }

    public CheckAssetJobStatusResponse withProgressPercent(Float progressPercent) {
        this.progressPercent = progressPercent;
        return this;
    }

    /** 作业进度百分比 minimum: 0 maximum: 1
     * 
     * @return progressPercent */
    public Float getProgressPercent() {
        return progressPercent;
    }

    public void setProgressPercent(Float progressPercent) {
        this.progressPercent = progressPercent;
    }

    public CheckAssetJobStatusResponse withArchiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }

    /** 导出作业成功时，供下载的资产包ID
     * 
     * @return archiveId */
    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public CheckAssetJobStatusResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /** 作业开始时间
     * 
     * @return beginTime */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public CheckAssetJobStatusResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 作业结束时间
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckAssetJobStatusResponse checkAssetJobStatusResponse = (CheckAssetJobStatusResponse) o;
        return Objects.equals(this.id, checkAssetJobStatusResponse.id)
            && Objects.equals(this.type, checkAssetJobStatusResponse.type)
            && Objects.equals(this.status, checkAssetJobStatusResponse.status)
            && Objects.equals(this.reasons, checkAssetJobStatusResponse.reasons)
            && Objects.equals(this.progressPercent, checkAssetJobStatusResponse.progressPercent)
            && Objects.equals(this.archiveId, checkAssetJobStatusResponse.archiveId)
            && Objects.equals(this.beginTime, checkAssetJobStatusResponse.beginTime)
            && Objects.equals(this.endTime, checkAssetJobStatusResponse.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, status, reasons, progressPercent, archiveId, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckAssetJobStatusResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
        sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
        sb.append("    archiveId: ").append(toIndentedString(archiveId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
