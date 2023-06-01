package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class OldExtends  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domains")
    
    private List<String> domains = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="top")
    

    private Integer top;

    public OldExtends withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    
    public OldExtends addDomainsItem(String domainsItem) {
        if(this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public OldExtends withDomains(Consumer<List<String>> domainsSetter) {
        if(this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 领域列表，多个领域用分号隔开。如果设置了领域且领域不为空，就从这些领域中匹配答案，否则就从该用户的全部知识库匹配答案。  当前最多支持10个领域。 
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    

    public OldExtends withTop(Integer top) {
        this.top = top;
        return this;
    }

    


    /**
     * 返回答案数量，默认为5，取值范围1~10。
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OldExtends oldExtends = (OldExtends) o;
        return Objects.equals(this.domains, oldExtends.domains) &&
            Objects.equals(this.top, oldExtends.top);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domains, top);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OldExtends {\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
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

