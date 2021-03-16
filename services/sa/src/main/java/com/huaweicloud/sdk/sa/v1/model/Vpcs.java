package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Vpcs
 */
public class Vpcs  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public Vpcs withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 虚拟私有云下可用子网的范围。 取值范围： 10.0.0.0/8~10.255.255.240/28、 172.16.0.0/12 ~ 172.31.255.240/28、 192.168.0.0/16 ~ 192.168.255.240/28。 约束：必须是cidr格式，例如:192.168.0.0/16。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    

    public Vpcs withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 功能说明：虚拟私有云的状态。 取值范围： CREATING：创建中； OK：创建成功。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vpcs vpcs = (Vpcs) o;
        return Objects.equals(this.cidr, vpcs.cidr) &&
            Objects.equals(this.status, vpcs.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cidr, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vpcs {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

