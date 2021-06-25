package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.IdNameEntry;
import com.huaweicloud.sdk.waf.v1.model.PremiumWafPoolOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * WAF独享引擎组详情
 */
public class PoolInfoResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="option")
    
    private PremiumWafPoolOption option;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosts")
    
    private List<IdNameEntry> hosts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<IdNameEntry> instances = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bindings")
    
    private List<IdNameEntry> bindings = null;
    
    public PoolInfoResponse withOption(PremiumWafPoolOption option) {
        this.option = option;
        return this;
    }

    public PoolInfoResponse withOption(Consumer<PremiumWafPoolOption> optionSetter) {
        if(this.option == null ){
            this.option = new PremiumWafPoolOption();
            optionSetter.accept(this.option);
        }
        
        return this;
    }


    /**
     * Get option
     * @return option
     */
    public PremiumWafPoolOption getOption() {
        return option;
    }

    public void setOption(PremiumWafPoolOption option) {
        this.option = option;
    }

    

    public PoolInfoResponse withHosts(List<IdNameEntry> hosts) {
        this.hosts = hosts;
        return this;
    }

    
    public PoolInfoResponse addHostsItem(IdNameEntry hostsItem) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public PoolInfoResponse withHosts(Consumer<List<IdNameEntry>> hostsSetter) {
        if(this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 关联的域名
     * @return hosts
     */
    public List<IdNameEntry> getHosts() {
        return hosts;
    }

    public void setHosts(List<IdNameEntry> hosts) {
        this.hosts = hosts;
    }

    

    public PoolInfoResponse withInstances(List<IdNameEntry> instances) {
        this.instances = instances;
        return this;
    }

    
    public PoolInfoResponse addInstancesItem(IdNameEntry instancesItem) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public PoolInfoResponse withInstances(Consumer<List<IdNameEntry>> instancesSetter) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 组内的独享引擎
     * @return instances
     */
    public List<IdNameEntry> getInstances() {
        return instances;
    }

    public void setInstances(List<IdNameEntry> instances) {
        this.instances = instances;
    }

    

    public PoolInfoResponse withBindings(List<IdNameEntry> bindings) {
        this.bindings = bindings;
        return this;
    }

    
    public PoolInfoResponse addBindingsItem(IdNameEntry bindingsItem) {
        if(this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        this.bindings.add(bindingsItem);
        return this;
    }

    public PoolInfoResponse withBindings(Consumer<List<IdNameEntry>> bindingsSetter) {
        if(this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        bindingsSetter.accept(this.bindings);
        return this;
    }

    /**
     * 绑定的LoadBalancer
     * @return bindings
     */
    public List<IdNameEntry> getBindings() {
        return bindings;
    }

    public void setBindings(List<IdNameEntry> bindings) {
        this.bindings = bindings;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PoolInfoResponse poolInfoResponse = (PoolInfoResponse) o;
        return Objects.equals(this.option, poolInfoResponse.option) &&
            Objects.equals(this.hosts, poolInfoResponse.hosts) &&
            Objects.equals(this.instances, poolInfoResponse.instances) &&
            Objects.equals(this.bindings, poolInfoResponse.bindings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(option, hosts, instances, bindings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolInfoResponse {\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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

