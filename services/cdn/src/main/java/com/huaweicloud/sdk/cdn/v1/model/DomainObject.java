package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DomainObject
 */
public class DomainObject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flux")
    
    private List<Integer> flux = null;
    
    public DomainObject withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    public DomainObject withFlux(List<Integer> flux) {
        this.flux = flux;
        return this;
    }

    
    public DomainObject addFluxItem(Integer fluxItem) {
        if(this.flux == null) {
            this.flux = new ArrayList<>();
        }
        this.flux.add(fluxItem);
        return this;
    }

    public DomainObject withFlux(Consumer<List<Integer>> fluxSetter) {
        if(this.flux == null) {
            this.flux = new ArrayList<>();
        }
        fluxSetter.accept(this.flux);
        return this;
    }

    /**
     * 数据结束时间戳，可能与请求时间不一致，可能不返回
     * @return flux
     */
    public List<Integer> getFlux() {
        return flux;
    }

    public void setFlux(List<Integer> flux) {
        this.flux = flux;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainObject domainObject = (DomainObject) o;
        return Objects.equals(this.domainName, domainObject.domainName) &&
            Objects.equals(this.flux, domainObject.flux);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainName, flux);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainObject {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    flux: ").append(toIndentedString(flux)).append("\n");
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

