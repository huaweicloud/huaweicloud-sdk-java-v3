package com.huaweicloud.sdk.cgs.v5;

import com.huaweicloud.sdk.cgs.v5.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CgsMeta {

    public static final HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodes =
        genForlistContainerNodes();

    private static HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> genForlistContainerNodes() {
        // basic
        HttpRequestDef.Builder<ListContainerNodesRequest, ListContainerNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListContainerNodesRequest.class, ListContainerNodesResponse.class)
                .withName("ListContainerNodes")
                .withUri("/v5/{project_id}/container/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getAgentStatus, (req, v) -> {
                req.setAgentStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

}
