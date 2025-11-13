package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ExportJobReq
 */
public class ExportJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exportDepend")

    private Boolean exportDepend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obsPath")

    private String obsPath;

    /**
     * 导出作业的状态，取值如下： - DEVELOP: 开发态，默认是开发态 - SUBMIT: 提交态
     */
    public static final class ExportStatusEnum {

        /**
         * Enum SUBMIT for value: "SUBMIT"
         */
        public static final ExportStatusEnum SUBMIT = new ExportStatusEnum("SUBMIT");

        /**
         * Enum DEVELOP for value: "DEVELOP"
         */
        public static final ExportStatusEnum DEVELOP = new ExportStatusEnum("DEVELOP");

        private static final Map<String, ExportStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExportStatusEnum> createStaticFields() {
            Map<String, ExportStatusEnum> map = new HashMap<>();
            map.put("SUBMIT", SUBMIT);
            map.put("DEVELOP", DEVELOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExportStatusEnum(String value) {
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
        public static ExportStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExportStatusEnum(value));
        }

        public static ExportStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExportStatusEnum) {
                return this.value.equals(((ExportStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exportStatus")

    private ExportStatusEnum exportStatus;

    public ExportJobReq withExportDepend(Boolean exportDepend) {
        this.exportDepend = exportDepend;
        return this;
    }

    /**
     * 是否导出作业依赖的脚本和资源，取值为true或者false，不传该值时，默认为true。
     * @return exportDepend
     */
    public Boolean getExportDepend() {
        return exportDepend;
    }

    public void setExportDepend(Boolean exportDepend) {
        this.exportDepend = exportDepend;
    }

    public ExportJobReq withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * 当导出到obs时，需要指定obs路径，样例：obs://test_bucket/job_nodes/
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public ExportJobReq withExportStatus(ExportStatusEnum exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }

    /**
     * 导出作业的状态，取值如下： - DEVELOP: 开发态，默认是开发态 - SUBMIT: 提交态
     * @return exportStatus
     */
    public ExportStatusEnum getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(ExportStatusEnum exportStatus) {
        this.exportStatus = exportStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportJobReq that = (ExportJobReq) obj;
        return Objects.equals(this.exportDepend, that.exportDepend) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.exportStatus, that.exportStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportDepend, obsPath, exportStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportJobReq {\n");
        sb.append("    exportDepend: ").append(toIndentedString(exportDepend)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
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
