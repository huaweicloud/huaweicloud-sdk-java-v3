package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateLtsInfoConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabale")

    private Boolean enabale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ltsIdInfo")

    private LtsIdInfo ltsIdInfo;

    public UpdateLtsInfoConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * lts配置信息id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateLtsInfoConfigResponse withEnabale(Boolean enabale) {
        this.enabale = enabale;
        return this;
    }

    /**
     * 是否开启全量日志   - false: 不开启   - true: 开启
     * @return enabale
     */
    public Boolean getEnabale() {
        return enabale;
    }

    public void setEnabale(Boolean enabale) {
        this.enabale = enabale;
    }

    public UpdateLtsInfoConfigResponse withLtsIdInfo(LtsIdInfo ltsIdInfo) {
        this.ltsIdInfo = ltsIdInfo;
        return this;
    }

    public UpdateLtsInfoConfigResponse withLtsIdInfo(Consumer<LtsIdInfo> ltsIdInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLtsInfoConfigResponse updateLtsInfoConfigResponse = (UpdateLtsInfoConfigResponse) o;
        return Objects.equals(this.id, updateLtsInfoConfigResponse.id)
            && Objects.equals(this.enabale, updateLtsInfoConfigResponse.enabale)
            && Objects.equals(this.ltsIdInfo, updateLtsInfoConfigResponse.ltsIdInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enabale, ltsIdInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLtsInfoConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabale: ").append(toIndentedString(enabale)).append("\n");
        sb.append("    ltsIdInfo: ").append(toIndentedString(ltsIdInfo)).append("\n");
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
