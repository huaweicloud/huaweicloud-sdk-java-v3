package com.huaweicloud.sdk.oms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class DstNodeReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ak")
    
    private String ak;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sk")
    
    private String sk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;

    public DstNodeReq withAk(String ak) {
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

    public DstNodeReq withSk(String sk) {
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

    public DstNodeReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    


    /**
     * 目的端桶的名称。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public DstNodeReq withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 目的端桶所处的区域。  请与Endpoint对应的区域保持一致。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DstNodeReq dstNodeReq = (DstNodeReq) o;
        return Objects.equals(this.ak, dstNodeReq.ak) &&
            Objects.equals(this.sk, dstNodeReq.sk) &&
            Objects.equals(this.bucket, dstNodeReq.bucket) &&
            Objects.equals(this.region, dstNodeReq.region);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ak, sk, bucket, region);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DstNodeReq {\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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

