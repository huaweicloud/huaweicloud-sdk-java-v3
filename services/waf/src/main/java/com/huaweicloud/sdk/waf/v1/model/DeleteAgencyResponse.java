package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    public DeleteAgencyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 代理id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteAgencyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 代理名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeleteAgencyResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 版本 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DeleteAgencyResponse withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释：** 代理存在时间段 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public DeleteAgencyResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 使用代理的domainid **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DeleteAgencyResponse withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * **参数解释：** 代理是否合法 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAgencyResponse that = (DeleteAgencyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.isValid, that.isValid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, version, duration, domainId, isValid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAgencyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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
