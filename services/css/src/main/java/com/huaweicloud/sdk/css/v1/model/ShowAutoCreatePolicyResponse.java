package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAutoCreatePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepday")

    @JacksonXmlProperty(localName = "keepday")

    private Integer keepday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    @JacksonXmlProperty(localName = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    @JacksonXmlProperty(localName = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    @JacksonXmlProperty(localName = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basePath")

    @JacksonXmlProperty(localName = "basePath")

    private String basePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    @JacksonXmlProperty(localName = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    @JacksonXmlProperty(localName = "enable")

    private String enable;

    public ShowAutoCreatePolicyResponse withKeepday(Integer keepday) {
        this.keepday = keepday;
        return this;
    }

    /**
     * 快照保留的天数。
     * @return keepday
     */
    public Integer getKeepday() {
        return keepday;
    }

    public void setKeepday(Integer keepday) {
        this.keepday = keepday;
    }

    public ShowAutoCreatePolicyResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 每天快照创建时刻。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ShowAutoCreatePolicyResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 快照命名前缀，需要用户自己手动输入。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ShowAutoCreatePolicyResponse withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 快照存放的OBS桶的桶名。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ShowAutoCreatePolicyResponse withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * 快照在OBS桶中的存放路径。
     * @return basePath
     */
    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public ShowAutoCreatePolicyResponse withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 访问OBS桶用到的委托。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public ShowAutoCreatePolicyResponse withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启自动创建快照策略。 - true：表示开启自动创建快照策略。 - false：表示关闭自动创建快照策略。
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAutoCreatePolicyResponse showAutoCreatePolicyResponse = (ShowAutoCreatePolicyResponse) o;
        return Objects.equals(this.keepday, showAutoCreatePolicyResponse.keepday)
            && Objects.equals(this.period, showAutoCreatePolicyResponse.period)
            && Objects.equals(this.prefix, showAutoCreatePolicyResponse.prefix)
            && Objects.equals(this.bucket, showAutoCreatePolicyResponse.bucket)
            && Objects.equals(this.basePath, showAutoCreatePolicyResponse.basePath)
            && Objects.equals(this.agency, showAutoCreatePolicyResponse.agency)
            && Objects.equals(this.enable, showAutoCreatePolicyResponse.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepday, period, prefix, bucket, basePath, agency, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoCreatePolicyResponse {\n");
        sb.append("    keepday: ").append(toIndentedString(keepday)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
