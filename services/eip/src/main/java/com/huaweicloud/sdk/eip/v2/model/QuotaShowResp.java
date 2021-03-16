package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 资源配额实例详情
 */
public class QuotaShowResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private Integer used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    
    private Integer quota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min")
    
    private Integer min;

    public QuotaShowResp withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 功能说明：根据type过滤查询指定类型的配额 取值范围：vpc，subnet，securityGroup，securityGroupRule，publicIp，vpn，vpngw，vpcPeer，firewall，shareBandwidth，shareBandwidthIP
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public QuotaShowResp withUsed(Integer used) {
        this.used = used;
        return this;
    }

    


    /**
     * 功能说明：已创建的资源个数 取值范围：0~quota数
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    

    public QuotaShowResp withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 功能说明：资源的最大配额数 取值范围：各类型资源默认配额数~Integer最大值 约束：资源的默认配额数可以修改，而且配额需要提前在底层配置，参考默认配置为：vpc默认5，子网默认100，安全组默认100，安全组规则默认5000，弹性公网IP默认10，vpn默认5，vpngw默认2，vpcPeer默认50，firewall默认200，shareBandwidth默认5，shareBandwidthIP默认20
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    

    public QuotaShowResp withMin(Integer min) {
        this.min = min;
        return this;
    }

    


    /**
     * 允许修改的配额最小值
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaShowResp quotaShowResp = (QuotaShowResp) o;
        return Objects.equals(this.type, quotaShowResp.type) &&
            Objects.equals(this.used, quotaShowResp.used) &&
            Objects.equals(this.quota, quotaShowResp.quota) &&
            Objects.equals(this.min, quotaShowResp.min);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota, min);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaShowResp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

