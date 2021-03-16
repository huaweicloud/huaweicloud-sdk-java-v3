package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QuotaSimpleInfo
 */
public class QuotaSimpleInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_id")
    
    private String quotaId;

    public QuotaSimpleInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 精英服务商ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public QuotaSimpleInfo withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    


    /**
     * 分配给精英服务商的代金券额度ID。
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaSimpleInfo quotaSimpleInfo = (QuotaSimpleInfo) o;
        return Objects.equals(this.id, quotaSimpleInfo.id) &&
            Objects.equals(this.quotaId, quotaSimpleInfo.quotaId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, quotaId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaSimpleInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
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

