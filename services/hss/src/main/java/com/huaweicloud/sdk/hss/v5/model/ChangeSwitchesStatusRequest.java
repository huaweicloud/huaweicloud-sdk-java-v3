package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeSwitchesStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 配置类型   - malware_sample_high_detect： 恶意软件高检出模式   - image_pay_per_scan： 镜像扫描按次计费功能开关   - image_popup： 镜像扫描按次计费弹窗开关   - image_free_to_pay_popup：镜像扫描功能免费转付费弹窗开关   - display_unprotected_host：显示未防护的主机 
     */
    public static final class CodeEnum {

        /**
         * Enum MALWARE_SAMPLE_HIGH_DETECT for value: "malware_sample_high_detect"
         */
        public static final CodeEnum MALWARE_SAMPLE_HIGH_DETECT = new CodeEnum("malware_sample_high_detect");

        /**
         * Enum IMAGE_PAY_PER_SCAN for value: "image_pay_per_scan"
         */
        public static final CodeEnum IMAGE_PAY_PER_SCAN = new CodeEnum("image_pay_per_scan");

        /**
         * Enum IMAGE_POPUP for value: "image_popup"
         */
        public static final CodeEnum IMAGE_POPUP = new CodeEnum("image_popup");

        /**
         * Enum IMAGE_FREE_TO_PAY_POPUP for value: "image_free_to_pay_popup"
         */
        public static final CodeEnum IMAGE_FREE_TO_PAY_POPUP = new CodeEnum("image_free_to_pay_popup");

        private static final Map<String, CodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodeEnum> createStaticFields() {
            Map<String, CodeEnum> map = new HashMap<>();
            map.put("malware_sample_high_detect", MALWARE_SAMPLE_HIGH_DETECT);
            map.put("image_pay_per_scan", IMAGE_PAY_PER_SCAN);
            map.put("image_popup", IMAGE_POPUP);
            map.put("image_free_to_pay_popup", IMAGE_FREE_TO_PAY_POPUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CodeEnum(String value) {
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
        public static CodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CodeEnum(value));
        }

        public static CodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodeEnum) {
                return this.value.equals(((CodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private CodeEnum code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ChangeSwitchesStatusRequestBody body;

    public ChangeSwitchesStatusRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ChangeSwitchesStatusRequest withCode(CodeEnum code) {
        this.code = code;
        return this;
    }

    /**
     * 配置类型   - malware_sample_high_detect： 恶意软件高检出模式   - image_pay_per_scan： 镜像扫描按次计费功能开关   - image_popup： 镜像扫描按次计费弹窗开关   - image_free_to_pay_popup：镜像扫描功能免费转付费弹窗开关   - display_unprotected_host：显示未防护的主机 
     * @return code
     */
    public CodeEnum getCode() {
        return code;
    }

    public void setCode(CodeEnum code) {
        this.code = code;
    }

    public ChangeSwitchesStatusRequest withBody(ChangeSwitchesStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public ChangeSwitchesStatusRequest withBody(Consumer<ChangeSwitchesStatusRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeSwitchesStatusRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ChangeSwitchesStatusRequestBody getBody() {
        return body;
    }

    public void setBody(ChangeSwitchesStatusRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeSwitchesStatusRequest that = (ChangeSwitchesStatusRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.code, that.code) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, code, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeSwitchesStatusRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
