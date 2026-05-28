package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检查url来源列表文件格式请求体
 */
public class CheckUrlSourceListFileFormatReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_file_key")

    private String listFileKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public CheckUrlSourceListFileFormatReq withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * 存放对象列表文件的OBS桶名。 请确保与目的端桶处于同一区域，否则将导致任务创建失败。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public CheckUrlSourceListFileFormatReq withListFileKey(String listFileKey) {
        this.listFileKey = listFileKey;
        return this;
    }

    /**
     * 对象列表文件或URL列表文件对象名。
     * @return listFileKey
     */
    public String getListFileKey() {
        return listFileKey;
    }

    public void setListFileKey(String listFileKey) {
        this.listFileKey = listFileKey;
    }

    public CheckUrlSourceListFileFormatReq withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 目的端桶的AK（最大长度100个字符）。
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public CheckUrlSourceListFileFormatReq withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 目的端桶的SK（最大长度100个字符）。
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public CheckUrlSourceListFileFormatReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 桶所处的区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckUrlSourceListFileFormatReq that = (CheckUrlSourceListFileFormatReq) obj;
        return Objects.equals(this.obsBucket, that.obsBucket) && Objects.equals(this.listFileKey, that.listFileKey)
            && Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsBucket, listFileKey, ak, sk, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckUrlSourceListFileFormatReq {\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    listFileKey: ").append(toIndentedString(listFileKey)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
