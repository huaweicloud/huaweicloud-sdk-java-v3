package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 敏感信息的内容类型和返回码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class AntileakageMapResponseBodyLeakagemap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive")

    private List<String> sensitive = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private List<String> code = null;

    public AntileakageMapResponseBodyLeakagemap withSensitive(List<String> sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    public AntileakageMapResponseBodyLeakagemap addSensitiveItem(String sensitiveItem) {
        if (this.sensitive == null) {
            this.sensitive = new ArrayList<>();
        }
        this.sensitive.add(sensitiveItem);
        return this;
    }

    public AntileakageMapResponseBodyLeakagemap withSensitive(Consumer<List<String>> sensitiveSetter) {
        if (this.sensitive == null) {
            this.sensitive = new ArrayList<>();
        }
        sensitiveSetter.accept(this.sensitive);
        return this;
    }

    /**
     * **参数解释：** 敏感信息的内容类型 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sensitive
     */
    public List<String> getSensitive() {
        return sensitive;
    }

    public void setSensitive(List<String> sensitive) {
        this.sensitive = sensitive;
    }

    public AntileakageMapResponseBodyLeakagemap withCode(List<String> code) {
        this.code = code;
        return this;
    }

    public AntileakageMapResponseBodyLeakagemap addCodeItem(String codeItem) {
        if (this.code == null) {
            this.code = new ArrayList<>();
        }
        this.code.add(codeItem);
        return this;
    }

    public AntileakageMapResponseBodyLeakagemap withCode(Consumer<List<String>> codeSetter) {
        if (this.code == null) {
            this.code = new ArrayList<>();
        }
        codeSetter.accept(this.code);
        return this;
    }

    /**
     * **参数解释：** 敏感信息的返回码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return code
     */
    public List<String> getCode() {
        return code;
    }

    public void setCode(List<String> code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntileakageMapResponseBodyLeakagemap that = (AntileakageMapResponseBodyLeakagemap) obj;
        return Objects.equals(this.sensitive, that.sensitive) && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensitive, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntileakageMapResponseBodyLeakagemap {\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
