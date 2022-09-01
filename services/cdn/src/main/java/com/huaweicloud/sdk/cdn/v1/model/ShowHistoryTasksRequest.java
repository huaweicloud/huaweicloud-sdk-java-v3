package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowHistoryTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    @JacksonXmlProperty(localName = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    @JacksonXmlProperty(localName = "page_number")

    private Integer pageNumber;

    /**
     * 任务状态。 task_inprocess 表示任务处理中，task_done表示任务完成。
     */
    public static final class StatusEnum {

        /**
         * Enum TASK_INPROCESS for value: "task_inprocess"
         */
        public static final StatusEnum TASK_INPROCESS = new StatusEnum("task_inprocess");

        /**
         * Enum TASK_DONE for value: "task_done"
         */
        public static final StatusEnum TASK_DONE = new StatusEnum("task_done");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("task_inprocess", TASK_INPROCESS);
            map.put("task_done", TASK_DONE);
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    @JacksonXmlProperty(localName = "start_date")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    @JacksonXmlProperty(localName = "end_date")

    private Long endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_field")

    @JacksonXmlProperty(localName = "order_field")

    private String orderField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_type")

    @JacksonXmlProperty(localName = "order_type")

    private String orderType;

    /**
     * 默认是文件file。file：文件,directory：目录。
     */
    public static final class FileTypeEnum {

        /**
         * Enum FILE for value: "file"
         */
        public static final FileTypeEnum FILE = new FileTypeEnum("file");

        /**
         * Enum DIRECTORY for value: "directory"
         */
        public static final FileTypeEnum DIRECTORY = new FileTypeEnum("directory");

        private static final Map<String, FileTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileTypeEnum> createStaticFields() {
            Map<String, FileTypeEnum> map = new HashMap<>();
            map.put("file", FILE);
            map.put("directory", DIRECTORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileTypeEnum(String value) {
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
        public static FileTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FileTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FileTypeEnum(value);
            }
            return result;
        }

        public static FileTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FileTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FileTypeEnum) {
                return this.value.equals(((FileTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    @JacksonXmlProperty(localName = "file_type")

    private FileTypeEnum fileType;

    public ShowHistoryTasksRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目，\"all\"表示所有项目。注意：当使用子账号调用接口时，该参数必传。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowHistoryTasksRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 单页最大数量，取值范围为1-10000。page_size和page_number必须同时传值。默认值30。
     * minimum: 1
     * maximum: 10000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowHistoryTasksRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 当前查询第几页，取值范围为1-65535。默认值1。
     * minimum: 1
     * maximum: 65535
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ShowHistoryTasksRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。 task_inprocess 表示任务处理中，task_done表示任务完成。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowHistoryTasksRequest withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 查询起始时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return startDate
     */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public ShowHistoryTasksRequest withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 查询结束时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return endDate
     */
    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public ShowHistoryTasksRequest withOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }

    /**
     * 用来排序的字段，支持的字段有“task_type”，“total”，“processing”， “succeed”，“failed”，“create_time”。order_field和order_type必须同时传值，否则使用默认值\"create_time\" 和 \"desc\"。
     * @return orderField
     */
    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public ShowHistoryTasksRequest withOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * desc 或者asc。默认值desc。
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public ShowHistoryTasksRequest withFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 默认是文件file。file：文件,directory：目录。
     * @return fileType
     */
    public FileTypeEnum getFileType() {
        return fileType;
    }

    public void setFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHistoryTasksRequest showHistoryTasksRequest = (ShowHistoryTasksRequest) o;
        return Objects.equals(this.enterpriseProjectId, showHistoryTasksRequest.enterpriseProjectId)
            && Objects.equals(this.pageSize, showHistoryTasksRequest.pageSize)
            && Objects.equals(this.pageNumber, showHistoryTasksRequest.pageNumber)
            && Objects.equals(this.status, showHistoryTasksRequest.status)
            && Objects.equals(this.startDate, showHistoryTasksRequest.startDate)
            && Objects.equals(this.endDate, showHistoryTasksRequest.endDate)
            && Objects.equals(this.orderField, showHistoryTasksRequest.orderField)
            && Objects.equals(this.orderType, showHistoryTasksRequest.orderType)
            && Objects.equals(this.fileType, showHistoryTasksRequest.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            pageSize,
            pageNumber,
            status,
            startDate,
            endDate,
            orderField,
            orderType,
            fileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryTasksRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
