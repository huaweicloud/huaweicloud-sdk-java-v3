package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import com.huaweicloud.sdk.iam.v3.model.MappingRules;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class MappingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private LinksSelf links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<MappingRules> rules = new ArrayList<>();
    
    public MappingResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 映射ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MappingResult withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public MappingResult withLinks(Consumer<LinksSelf> linksSetter) {
        if(this.links == null ){
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    public MappingResult withRules(List<MappingRules> rules) {
        this.rules = rules;
        return this;
    }

    
    public MappingResult addRulesItem(MappingRules rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    public MappingResult withRules(Consumer<List<MappingRules>> rulesSetter) {
        if(this.rules == null ){
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 将联邦用户映射为本地用户的规则列表。
     * @return rules
     */
    public List<MappingRules> getRules() {
        return rules;
    }

    public void setRules(List<MappingRules> rules) {
        this.rules = rules;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MappingResult mappingResult = (MappingResult) o;
        return Objects.equals(this.id, mappingResult.id) &&
            Objects.equals(this.links, mappingResult.links) &&
            Objects.equals(this.rules, mappingResult.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MappingResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

