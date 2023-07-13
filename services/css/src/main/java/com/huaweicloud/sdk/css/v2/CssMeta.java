package com.huaweicloud.sdk.css.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.css.v2.model.CreateClusterReq;
import com.huaweicloud.sdk.css.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.css.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.css.v2.model.RestartClusterReq;
import com.huaweicloud.sdk.css.v2.model.RestartClusterRequest;
import com.huaweicloud.sdk.css.v2.model.RestartClusterResponse;
import com.huaweicloud.sdk.css.v2.model.RollingRestartReq;
import com.huaweicloud.sdk.css.v2.model.RollingRestartRequest;
import com.huaweicloud.sdk.css.v2.model.RollingRestartResponse;
import com.huaweicloud.sdk.css.v2.model.StartAutoCreateSnapshotsReq;
import com.huaweicloud.sdk.css.v2.model.StartAutoCreateSnapshotsRequest;
import com.huaweicloud.sdk.css.v2.model.StartAutoCreateSnapshotsResponse;
import com.huaweicloud.sdk.css.v2.model.StopAutoCreateSnapshotsRequest;
import com.huaweicloud.sdk.css.v2.model.StopAutoCreateSnapshotsResponse;

@SuppressWarnings("unchecked")
public class CssMeta {

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v2.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartClusterRequest, RestartClusterResponse> restartCluster =
        genForrestartCluster();

    private static HttpRequestDef<RestartClusterRequest, RestartClusterResponse> genForrestartCluster() {
        // basic
        HttpRequestDef.Builder<RestartClusterRequest, RestartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartClusterRequest.class, RestartClusterResponse.class)
                .withName("RestartCluster")
                .withUri("/v2.0/{project_id}/clusters/{cluster_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<RestartClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartClusterReq.class),
            f -> f.withMarshaller(RestartClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollingRestartRequest, RollingRestartResponse> rollingRestart =
        genForrollingRestart();

    private static HttpRequestDef<RollingRestartRequest, RollingRestartResponse> genForrollingRestart() {
        // basic
        HttpRequestDef.Builder<RollingRestartRequest, RollingRestartResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RollingRestartRequest.class, RollingRestartResponse.class)
                .withName("RollingRestart")
                .withUri("/v2.0/{project_id}/clusters/{cluster_id}/rolling_restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollingRestartRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<RollingRestartReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RollingRestartReq.class),
            f -> f.withMarshaller(RollingRestartRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse> startAutoCreateSnapshots =
        genForstartAutoCreateSnapshots();

    private static HttpRequestDef<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse> genForstartAutoCreateSnapshots() {
        // basic
        HttpRequestDef.Builder<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, StartAutoCreateSnapshotsRequest.class, StartAutoCreateSnapshotsResponse.class)
                .withName("StartAutoCreateSnapshots")
                .withUri("/v2.0/{project_id}/clusters/{cluster_id}/snapshots/policy/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoCreateSnapshotsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartAutoCreateSnapshotsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartAutoCreateSnapshotsReq.class),
            f -> f.withMarshaller(StartAutoCreateSnapshotsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse> stopAutoCreateSnapshots =
        genForstopAutoCreateSnapshots();

    private static HttpRequestDef<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse> genForstopAutoCreateSnapshots() {
        // basic
        HttpRequestDef.Builder<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, StopAutoCreateSnapshotsRequest.class, StopAutoCreateSnapshotsResponse.class)
            .withName("StopAutoCreateSnapshots")
            .withUri("/v2.0/{project_id}/clusters/{cluster_id}/snapshots/policy/close")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAutoCreateSnapshotsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

}
