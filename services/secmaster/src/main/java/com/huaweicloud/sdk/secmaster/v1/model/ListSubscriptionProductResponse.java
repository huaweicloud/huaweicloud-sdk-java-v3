package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSubscriptionProductResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic")

    private ProductRspBasic basic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private ProductRspStandard standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "professional")

    private ProductRspProfessional professional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "large_screen")

    private ProductRspLargeScreen largeScreen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_collection")

    private ProductRspLogCollection logCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_retention")

    private ProductRspLogRetention logRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_analysis")

    private ProductRspLogAnalysis logAnalysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "soar")

    private ProductRspSoar soar;

    public ListSubscriptionProductResponse withBasic(ProductRspBasic basic) {
        this.basic = basic;
        return this;
    }

    public ListSubscriptionProductResponse withBasic(Consumer<ProductRspBasic> basicSetter) {
        if (this.basic == null) {
            this.basic = new ProductRspBasic();
            basicSetter.accept(this.basic);
        }

        return this;
    }

    /**
     * Get basic
     * @return basic
     */
    public ProductRspBasic getBasic() {
        return basic;
    }

    public void setBasic(ProductRspBasic basic) {
        this.basic = basic;
    }

    public ListSubscriptionProductResponse withStandard(ProductRspStandard standard) {
        this.standard = standard;
        return this;
    }

    public ListSubscriptionProductResponse withStandard(Consumer<ProductRspStandard> standardSetter) {
        if (this.standard == null) {
            this.standard = new ProductRspStandard();
            standardSetter.accept(this.standard);
        }

        return this;
    }

    /**
     * Get standard
     * @return standard
     */
    public ProductRspStandard getStandard() {
        return standard;
    }

    public void setStandard(ProductRspStandard standard) {
        this.standard = standard;
    }

    public ListSubscriptionProductResponse withProfessional(ProductRspProfessional professional) {
        this.professional = professional;
        return this;
    }

    public ListSubscriptionProductResponse withProfessional(Consumer<ProductRspProfessional> professionalSetter) {
        if (this.professional == null) {
            this.professional = new ProductRspProfessional();
            professionalSetter.accept(this.professional);
        }

        return this;
    }

    /**
     * Get professional
     * @return professional
     */
    public ProductRspProfessional getProfessional() {
        return professional;
    }

    public void setProfessional(ProductRspProfessional professional) {
        this.professional = professional;
    }

    public ListSubscriptionProductResponse withLargeScreen(ProductRspLargeScreen largeScreen) {
        this.largeScreen = largeScreen;
        return this;
    }

    public ListSubscriptionProductResponse withLargeScreen(Consumer<ProductRspLargeScreen> largeScreenSetter) {
        if (this.largeScreen == null) {
            this.largeScreen = new ProductRspLargeScreen();
            largeScreenSetter.accept(this.largeScreen);
        }

        return this;
    }

    /**
     * Get largeScreen
     * @return largeScreen
     */
    public ProductRspLargeScreen getLargeScreen() {
        return largeScreen;
    }

    public void setLargeScreen(ProductRspLargeScreen largeScreen) {
        this.largeScreen = largeScreen;
    }

    public ListSubscriptionProductResponse withLogCollection(ProductRspLogCollection logCollection) {
        this.logCollection = logCollection;
        return this;
    }

    public ListSubscriptionProductResponse withLogCollection(Consumer<ProductRspLogCollection> logCollectionSetter) {
        if (this.logCollection == null) {
            this.logCollection = new ProductRspLogCollection();
            logCollectionSetter.accept(this.logCollection);
        }

        return this;
    }

    /**
     * Get logCollection
     * @return logCollection
     */
    public ProductRspLogCollection getLogCollection() {
        return logCollection;
    }

    public void setLogCollection(ProductRspLogCollection logCollection) {
        this.logCollection = logCollection;
    }

    public ListSubscriptionProductResponse withLogRetention(ProductRspLogRetention logRetention) {
        this.logRetention = logRetention;
        return this;
    }

    public ListSubscriptionProductResponse withLogRetention(Consumer<ProductRspLogRetention> logRetentionSetter) {
        if (this.logRetention == null) {
            this.logRetention = new ProductRspLogRetention();
            logRetentionSetter.accept(this.logRetention);
        }

        return this;
    }

    /**
     * Get logRetention
     * @return logRetention
     */
    public ProductRspLogRetention getLogRetention() {
        return logRetention;
    }

    public void setLogRetention(ProductRspLogRetention logRetention) {
        this.logRetention = logRetention;
    }

    public ListSubscriptionProductResponse withLogAnalysis(ProductRspLogAnalysis logAnalysis) {
        this.logAnalysis = logAnalysis;
        return this;
    }

    public ListSubscriptionProductResponse withLogAnalysis(Consumer<ProductRspLogAnalysis> logAnalysisSetter) {
        if (this.logAnalysis == null) {
            this.logAnalysis = new ProductRspLogAnalysis();
            logAnalysisSetter.accept(this.logAnalysis);
        }

        return this;
    }

    /**
     * Get logAnalysis
     * @return logAnalysis
     */
    public ProductRspLogAnalysis getLogAnalysis() {
        return logAnalysis;
    }

    public void setLogAnalysis(ProductRspLogAnalysis logAnalysis) {
        this.logAnalysis = logAnalysis;
    }

    public ListSubscriptionProductResponse withSoar(ProductRspSoar soar) {
        this.soar = soar;
        return this;
    }

    public ListSubscriptionProductResponse withSoar(Consumer<ProductRspSoar> soarSetter) {
        if (this.soar == null) {
            this.soar = new ProductRspSoar();
            soarSetter.accept(this.soar);
        }

        return this;
    }

    /**
     * Get soar
     * @return soar
     */
    public ProductRspSoar getSoar() {
        return soar;
    }

    public void setSoar(ProductRspSoar soar) {
        this.soar = soar;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionProductResponse that = (ListSubscriptionProductResponse) obj;
        return Objects.equals(this.basic, that.basic) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.professional, that.professional)
            && Objects.equals(this.largeScreen, that.largeScreen)
            && Objects.equals(this.logCollection, that.logCollection)
            && Objects.equals(this.logRetention, that.logRetention)
            && Objects.equals(this.logAnalysis, that.logAnalysis) && Objects.equals(this.soar, that.soar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basic, standard, professional, largeScreen, logCollection, logRetention, logAnalysis, soar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionProductResponse {\n");
        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    professional: ").append(toIndentedString(professional)).append("\n");
        sb.append("    largeScreen: ").append(toIndentedString(largeScreen)).append("\n");
        sb.append("    logCollection: ").append(toIndentedString(logCollection)).append("\n");
        sb.append("    logRetention: ").append(toIndentedString(logRetention)).append("\n");
        sb.append("    logAnalysis: ").append(toIndentedString(logAnalysis)).append("\n");
        sb.append("    soar: ").append(toIndentedString(soar)).append("\n");
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
