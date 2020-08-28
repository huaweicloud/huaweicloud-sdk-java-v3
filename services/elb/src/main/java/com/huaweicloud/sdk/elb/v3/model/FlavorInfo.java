package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规格内容信息
 */
public class FlavorInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection")
    
    private Integer connection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cps")
    
    private Integer cps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qps")
    
    private Integer qps;

    public FlavorInfo withConnection(Integer connection) {
        this.connection = connection;
        return this;
    }

    


    /**
     * 并发数。
     * @return connection
     */
    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public FlavorInfo withCps(Integer cps) {
        this.cps = cps;
        return this;
    }

    


    /**
     * 新建数。
     * @return cps
     */
    public Integer getCps() {
        return cps;
    }

    public void setCps(Integer cps) {
        this.cps = cps;
    }

    public FlavorInfo withQps(Integer qps) {
        this.qps = qps;
        return this;
    }

    


    /**
     * 7层每秒查询数
     * @return qps
     */
    public Integer getQps() {
        return qps;
    }

    public void setQps(Integer qps) {
        this.qps = qps;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorInfo flavorInfo = (FlavorInfo) o;
        return Objects.equals(this.connection, flavorInfo.connection) &&
            Objects.equals(this.cps, flavorInfo.cps) &&
            Objects.equals(this.qps, flavorInfo.qps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(connection, cps, qps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorInfo {\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    cps: ").append(toIndentedString(cps)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
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

