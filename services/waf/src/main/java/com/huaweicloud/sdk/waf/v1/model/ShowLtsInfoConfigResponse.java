package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLtsInfoConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ltsIdInfo")

    private LtsIdInfo ltsIdInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabale")

    private Boolean enabale;

    public ShowLtsInfoConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * lts配置信息id，每个企业项目对应唯一id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowLtsInfoConfigResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启全量日志   - false: 不开启   - true: 开启
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowLtsInfoConfigResponse withLtsIdInfo(LtsIdInfo ltsIdInfo) {
        this.ltsIdInfo = ltsIdInfo;
        return this;
    }

    public ShowLtsInfoConfigResponse withLtsIdInfo(Consumer<LtsIdInfo> ltsIdInfoSetter) {
        if (this.ltsIdInfo == null) {
            this.ltsIdInfo = new LtsIdInfo();
            ltsIdInfoSetter.accept(this.ltsIdInfo);
        }

        return this;
    }

    /**
     * Get ltsIdInfo
     * @return ltsIdInfo
     */
    public LtsIdInfo getLtsIdInfo() {
        return ltsIdInfo;
    }

    public void setLtsIdInfo(LtsIdInfo ltsIdInfo) {
        this.ltsIdInfo = ltsIdInfo;
    }

    public ShowLtsInfoConfigResponse withEnabale(Boolean enabale) {
        this.enabale = enabale;
        return this;
    }

    /**
     * 该参数废弃，请忽略
     * @return enabale
     */
    public Boolean getEnabale() {
        return enabale;
    }

    public void setEnabale(Boolean enabale) {
        this.enabale = enabale;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLtsInfoConfigResponse that = (ShowLtsInfoConfigResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.ltsIdInfo, that.ltsIdInfo) && Objects.equals(this.enabale, that.enabale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enabled, ltsIdInfo, enabale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLtsInfoConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ltsIdInfo: ").append(toIndentedString(ltsIdInfo)).append("\n");
        sb.append("    enabale: ").append(toIndentedString(enabale)).append("\n");
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
