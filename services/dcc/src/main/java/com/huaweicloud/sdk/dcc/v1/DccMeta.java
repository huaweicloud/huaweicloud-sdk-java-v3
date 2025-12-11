package com.huaweicloud.sdk.dcc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dcc.v1.model.ShowResourceClustersRequest;
import com.huaweicloud.sdk.dcc.v1.model.ShowResourceClustersResponse;

@SuppressWarnings("unchecked")
public class DccMeta {

    public static final HttpRequestDef<ShowResourceClustersRequest, ShowResourceClustersResponse> showResourceClusters =
        genForShowResourceClusters();

    private static HttpRequestDef<ShowResourceClustersRequest, ShowResourceClustersResponse> genForShowResourceClusters() {
        // basic
        HttpRequestDef.Builder<ShowResourceClustersRequest, ShowResourceClustersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourceClustersRequest.class, ShowResourceClustersResponse.class)
            .withName("ShowResourceClusters")
            .withUri("/v1/{project_id}/dcc/resource_clusters")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceClustersRequest::getServiceType,
                ShowResourceClustersRequest::setServiceType));

        // response

        return builder.build();
    }

}
