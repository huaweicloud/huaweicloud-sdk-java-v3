package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.BillingUpdate;
import com.huaweicloud.sdk.cbr.v1.model.VaultBindRules;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VaultUpdate
 */
public class VaultUpdate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billing")
    
    private BillingUpdate billing;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_bind")
    
    private Boolean autoBind;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_rules")
    
    private VaultBindRules bindRules;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_expand")
    
    private Boolean autoExpand;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_notify")
    
    private Boolean smnNotify;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold")
    
    private Integer threshold;

    public VaultUpdate withBilling(BillingUpdate billing) {
        this.billing = billing;
        return this;
    }

    public VaultUpdate withBilling(Consumer<BillingUpdate> billingSetter) {
        if(this.billing == null ){
            this.billing = new BillingUpdate();
            billingSetter.accept(this.billing);
        }
        
        return this;
    }


    /**
     * Get billing
     * @return billing
     */
    public BillingUpdate getBilling() {
        return billing;
    }

    public void setBilling(BillingUpdate billing) {
        this.billing = billing;
    }

    

    public VaultUpdate withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 存储库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VaultUpdate withAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
        return this;
    }

    


    /**
     * 是否支持自动挂载
     * @return autoBind
     */
    public Boolean getAutoBind() {
        return autoBind;
    }

    public void setAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
    }

    

    public VaultUpdate withBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
        return this;
    }

    public VaultUpdate withBindRules(Consumer<VaultBindRules> bindRulesSetter) {
        if(this.bindRules == null ){
            this.bindRules = new VaultBindRules();
            bindRulesSetter.accept(this.bindRules);
        }
        
        return this;
    }


    /**
     * Get bindRules
     * @return bindRules
     */
    public VaultBindRules getBindRules() {
        return bindRules;
    }

    public void setBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
    }

    

    public VaultUpdate withAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
        return this;
    }

    


    /**
     * 是否自动扩容。按需存储库支持自动扩容，包周期存储库不支持扩容。
     * @return autoExpand
     */
    public Boolean getAutoExpand() {
        return autoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    

    public VaultUpdate withSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
        return this;
    }

    


    /**
     * 发送smn通知开关
     * @return smnNotify
     */
    public Boolean getSmnNotify() {
        return smnNotify;
    }

    public void setSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
    }

    

    public VaultUpdate withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    


    /**
     * 存储库容量阈值，存储库已用容量和总容量的百分比超过该值，若smn_notify为开，将发送相关通知。
     * minimum: 1
     * maximum: 100
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultUpdate vaultUpdate = (VaultUpdate) o;
        return Objects.equals(this.billing, vaultUpdate.billing) &&
            Objects.equals(this.name, vaultUpdate.name) &&
            Objects.equals(this.autoBind, vaultUpdate.autoBind) &&
            Objects.equals(this.bindRules, vaultUpdate.bindRules) &&
            Objects.equals(this.autoExpand, vaultUpdate.autoExpand) &&
            Objects.equals(this.smnNotify, vaultUpdate.smnNotify) &&
            Objects.equals(this.threshold, vaultUpdate.threshold);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billing, name, autoBind, bindRules, autoExpand, smnNotify, threshold);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultUpdate {\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    autoBind: ").append(toIndentedString(autoBind)).append("\n");
        sb.append("    bindRules: ").append(toIndentedString(bindRules)).append("\n");
        sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
        sb.append("    smnNotify: ").append(toIndentedString(smnNotify)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

