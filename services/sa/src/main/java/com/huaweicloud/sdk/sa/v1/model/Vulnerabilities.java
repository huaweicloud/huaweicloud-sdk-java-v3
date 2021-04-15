package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sa.v1.model.Patch;
import com.huaweicloud.sdk.sa.v1.model.Vulnerability;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Vulnerabilities
 */
public class Vulnerabilities  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vulnerability_list")
    
    private List<Vulnerability> vulnerabilityList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="patch_list")
    
    private List<Patch> patchList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reference_urls")
    
    private List<String> referenceUrls = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="related_vulnerabilities")
    
    private List<String> relatedVulnerabilities = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vendor_name")
    
    private String vendorName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vulnerable_packages")
    
    private List<String> vulnerablePackages = null;
    
    public Vulnerabilities withVulnerabilityList(List<Vulnerability> vulnerabilityList) {
        this.vulnerabilityList = vulnerabilityList;
        return this;
    }

    
    public Vulnerabilities addVulnerabilityListItem(Vulnerability vulnerabilityListItem) {
        if(this.vulnerabilityList == null) {
            this.vulnerabilityList = new ArrayList<>();
        }
        this.vulnerabilityList.add(vulnerabilityListItem);
        return this;
    }

    public Vulnerabilities withVulnerabilityList(Consumer<List<Vulnerability>> vulnerabilityListSetter) {
        if(this.vulnerabilityList == null) {
            this.vulnerabilityList = new ArrayList<>();
        }
        vulnerabilityListSetter.accept(this.vulnerabilityList);
        return this;
    }

    /**
     * 漏洞信息。
     * @return vulnerabilityList
     */
    public List<Vulnerability> getVulnerabilityList() {
        return vulnerabilityList;
    }

    public void setVulnerabilityList(List<Vulnerability> vulnerabilityList) {
        this.vulnerabilityList = vulnerabilityList;
    }

    

    public Vulnerabilities withPatchList(List<Patch> patchList) {
        this.patchList = patchList;
        return this;
    }

    
    public Vulnerabilities addPatchListItem(Patch patchListItem) {
        if(this.patchList == null) {
            this.patchList = new ArrayList<>();
        }
        this.patchList.add(patchListItem);
        return this;
    }

    public Vulnerabilities withPatchList(Consumer<List<Patch>> patchListSetter) {
        if(this.patchList == null) {
            this.patchList = new ArrayList<>();
        }
        patchListSetter.accept(this.patchList);
        return this;
    }

    /**
     * 补丁信息。
     * @return patchList
     */
    public List<Patch> getPatchList() {
        return patchList;
    }

    public void setPatchList(List<Patch> patchList) {
        this.patchList = patchList;
    }

    

    public Vulnerabilities withReferenceUrls(List<String> referenceUrls) {
        this.referenceUrls = referenceUrls;
        return this;
    }

    
    public Vulnerabilities addReferenceUrlsItem(String referenceUrlsItem) {
        if(this.referenceUrls == null) {
            this.referenceUrls = new ArrayList<>();
        }
        this.referenceUrls.add(referenceUrlsItem);
        return this;
    }

    public Vulnerabilities withReferenceUrls(Consumer<List<String>> referenceUrlsSetter) {
        if(this.referenceUrls == null) {
            this.referenceUrls = new ArrayList<>();
        }
        referenceUrlsSetter.accept(this.referenceUrls);
        return this;
    }

    /**
     * 参考链接，提供有关此漏洞更多信息的URL列表。
     * @return referenceUrls
     */
    public List<String> getReferenceUrls() {
        return referenceUrls;
    }

    public void setReferenceUrls(List<String> referenceUrls) {
        this.referenceUrls = referenceUrls;
    }

    

    public Vulnerabilities withRelatedVulnerabilities(List<String> relatedVulnerabilities) {
        this.relatedVulnerabilities = relatedVulnerabilities;
        return this;
    }

    
    public Vulnerabilities addRelatedVulnerabilitiesItem(String relatedVulnerabilitiesItem) {
        if(this.relatedVulnerabilities == null) {
            this.relatedVulnerabilities = new ArrayList<>();
        }
        this.relatedVulnerabilities.add(relatedVulnerabilitiesItem);
        return this;
    }

    public Vulnerabilities withRelatedVulnerabilities(Consumer<List<String>> relatedVulnerabilitiesSetter) {
        if(this.relatedVulnerabilities == null) {
            this.relatedVulnerabilities = new ArrayList<>();
        }
        relatedVulnerabilitiesSetter.accept(this.relatedVulnerabilities);
        return this;
    }

    /**
     * 相关漏洞，提供与此漏洞相关的漏洞ID列表。
     * @return relatedVulnerabilities
     */
    public List<String> getRelatedVulnerabilities() {
        return relatedVulnerabilities;
    }

    public void setRelatedVulnerabilities(List<String> relatedVulnerabilities) {
        this.relatedVulnerabilities = relatedVulnerabilities;
    }

    

    public Vulnerabilities withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    


    /**
     * 漏洞报告提供者信息。
     * @return vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    

    public Vulnerabilities withVulnerablePackages(List<String> vulnerablePackages) {
        this.vulnerablePackages = vulnerablePackages;
        return this;
    }

    
    public Vulnerabilities addVulnerablePackagesItem(String vulnerablePackagesItem) {
        if(this.vulnerablePackages == null) {
            this.vulnerablePackages = new ArrayList<>();
        }
        this.vulnerablePackages.add(vulnerablePackagesItem);
        return this;
    }

    public Vulnerabilities withVulnerablePackages(Consumer<List<String>> vulnerablePackagesSetter) {
        if(this.vulnerablePackages == null) {
            this.vulnerablePackages = new ArrayList<>();
        }
        vulnerablePackagesSetter.accept(this.vulnerablePackages);
        return this;
    }

    /**
     * 受影响软件及版本列表。
     * @return vulnerablePackages
     */
    public List<String> getVulnerablePackages() {
        return vulnerablePackages;
    }

    public void setVulnerablePackages(List<String> vulnerablePackages) {
        this.vulnerablePackages = vulnerablePackages;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vulnerabilities vulnerabilities = (Vulnerabilities) o;
        return Objects.equals(this.vulnerabilityList, vulnerabilities.vulnerabilityList) &&
            Objects.equals(this.patchList, vulnerabilities.patchList) &&
            Objects.equals(this.referenceUrls, vulnerabilities.referenceUrls) &&
            Objects.equals(this.relatedVulnerabilities, vulnerabilities.relatedVulnerabilities) &&
            Objects.equals(this.vendorName, vulnerabilities.vendorName) &&
            Objects.equals(this.vulnerablePackages, vulnerabilities.vulnerablePackages);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vulnerabilityList, patchList, referenceUrls, relatedVulnerabilities, vendorName, vulnerablePackages);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vulnerabilities {\n");
        sb.append("    vulnerabilityList: ").append(toIndentedString(vulnerabilityList)).append("\n");
        sb.append("    patchList: ").append(toIndentedString(patchList)).append("\n");
        sb.append("    referenceUrls: ").append(toIndentedString(referenceUrls)).append("\n");
        sb.append("    relatedVulnerabilities: ").append(toIndentedString(relatedVulnerabilities)).append("\n");
        sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
        sb.append("    vulnerablePackages: ").append(toIndentedString(vulnerablePackages)).append("\n");
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

