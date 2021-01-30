package com.huaweicloud.sdk.core.internal.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

public class KeystoneListRegionsResponse extends SdkResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")
    private List<Region> regions = null;

    public KeystoneListRegionsResponse withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

    public KeystoneListRegionsResponse addRegionsItem(Region regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public KeystoneListRegionsResponse withRegions(Consumer<List<Region>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域信息列表。
     *
     * @return regions
     */
    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

}

