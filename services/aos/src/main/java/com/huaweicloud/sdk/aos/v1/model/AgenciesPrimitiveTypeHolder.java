package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.Agency;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AgenciesPrimitiveTypeHolder
 */
public class AgenciesPrimitiveTypeHolder  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agencies")
    
    
    private List<Agency> agencies = null;
    
    public AgenciesPrimitiveTypeHolder withAgencies(List<Agency> agencies) {
        this.agencies = agencies;
        return this;
    }

    
    public AgenciesPrimitiveTypeHolder addAgenciesItem(Agency agenciesItem) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        this.agencies.add(agenciesItem);
        return this;
    }

    public AgenciesPrimitiveTypeHolder withAgencies(Consumer<List<Agency>> agenciesSetter) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        agenciesSetter.accept(this.agencies);
        return this;
    }

    /**
     * 委托授权的信息。
     * @return agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgenciesPrimitiveTypeHolder agenciesPrimitiveTypeHolder = (AgenciesPrimitiveTypeHolder) o;
        return Objects.equals(this.agencies, agenciesPrimitiveTypeHolder.agencies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agencies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgenciesPrimitiveTypeHolder {\n");
        sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
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

