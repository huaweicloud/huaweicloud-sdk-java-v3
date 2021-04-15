package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.bcs.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class BcsMeta {

    public static final HttpRequestDef<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> batchAddPeersToChannel = genForbatchAddPeersToChannel();

    private static HttpRequestDef<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> genForbatchAddPeersToChannel() {
        // basic
        HttpRequestDef.Builder<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddPeersToChannelRequest.class, BatchAddPeersToChannelResponse.class)
                .withName("BatchAddPeersToChannel")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/channels/peers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchAddPeersToChannelRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchAddPeersToChannelRequestBody.class,
            f -> f.withMarshaller(BatchAddPeersToChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateChannelsRequest, BatchCreateChannelsResponse> batchCreateChannels = genForbatchCreateChannels();

    private static HttpRequestDef<BatchCreateChannelsRequest, BatchCreateChannelsResponse> genForbatchCreateChannels() {
        // basic
        HttpRequestDef.Builder<BatchCreateChannelsRequest, BatchCreateChannelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateChannelsRequest.class, BatchCreateChannelsResponse.class)
                .withName("BatchCreateChannels")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/channels")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateChannelsRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateChannelsRequestBody.class,
            f -> f.withMarshaller(BatchCreateChannelsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> batchInviteMembersToChannel = genForbatchInviteMembersToChannel();

    private static HttpRequestDef<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> genForbatchInviteMembersToChannel() {
        // basic
        HttpRequestDef.Builder<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchInviteMembersToChannelRequest.class, BatchInviteMembersToChannelResponse.class)
                .withName("BatchInviteMembersToChannel")
                .withUri("/v2/{project_id}/members/invitations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchInviteMembersToChannelRequestBody.class,
            f -> f.withMarshaller(BatchInviteMembersToChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateNewBlockchainRequest, CreateNewBlockchainResponse> createNewBlockchain = genForcreateNewBlockchain();

    private static HttpRequestDef<CreateNewBlockchainRequest, CreateNewBlockchainResponse> genForcreateNewBlockchain() {
        // basic
        HttpRequestDef.Builder<CreateNewBlockchainRequest, CreateNewBlockchainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNewBlockchainRequest.class, CreateNewBlockchainResponse.class)
                .withName("CreateNewBlockchain")
                .withUri("/v2/{project_id}/blockchains")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRequestBody.class,
            f -> f.withMarshaller(CreateNewBlockchainRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteBlockchainRequest, DeleteBlockchainResponse> deleteBlockchain = genFordeleteBlockchain();

    private static HttpRequestDef<DeleteBlockchainRequest, DeleteBlockchainResponse> genFordeleteBlockchain() {
        // basic
        HttpRequestDef.Builder<DeleteBlockchainRequest, DeleteBlockchainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBlockchainRequest.class, DeleteBlockchainResponse.class)
                .withName("DeleteBlockchain")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBlockchainRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("is_delete_storage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteStorage, (req, v) -> {
                req.setIsDeleteStorage(v);
            })
        );
        builder.withRequestField("is_delete_obs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteObs, (req, v) -> {
                req.setIsDeleteObs(v);
            })
        );
        builder.withRequestField("is_delete_resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteResource, (req, v) -> {
                req.setIsDeleteResource(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> downloadBlockchainCert = genFordownloadBlockchainCert();

    private static HttpRequestDef<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> genFordownloadBlockchainCert() {
        // basic
        HttpRequestDef.Builder<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadBlockchainCertRequest.class, DownloadBlockchainCertResponse.class)
                .withName("DownloadBlockchainCert")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/cert")
                .withContentType("application/json");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("org_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getOrgName, (req, v) -> {
                req.setOrgName(v);
            })
        );
        builder.withRequestField("cert_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            DownloadBlockchainCertRequest.CertTypeEnum.class,
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getCertType, (req, v) -> {
                req.setCertType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfig = genFordownloadBlockchainSdkConfig();

    private static HttpRequestDef<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> genFordownloadBlockchainSdkConfig() {
        // basic
        HttpRequestDef.Builder<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadBlockchainSdkConfigRequest.class, DownloadBlockchainSdkConfigResponse.class)
                .withName("DownloadBlockchainSdkConfig")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/sdk-cfg")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadBlockchainSdkConfigRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CfgRequestBody.class,
            f -> f.withMarshaller(DownloadBlockchainSdkConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<HandleNotificationRequest, HandleNotificationResponse> handleNotification = genForhandleNotification();

    private static HttpRequestDef<HandleNotificationRequest, HandleNotificationResponse> genForhandleNotification() {
        // basic
        HttpRequestDef.Builder<HandleNotificationRequest, HandleNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HandleNotificationRequest.class, HandleNotificationResponse.class)
                .withName("HandleNotification")
                .withUri("/v2/{project_id}/notification/handle")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            HandleNotificationRequestBody.class,
            f -> f.withMarshaller(HandleNotificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBcsMetricRequest, ListBcsMetricResponse> listBcsMetric = genForlistBcsMetric();

    private static HttpRequestDef<ListBcsMetricRequest, ListBcsMetricResponse> genForlistBcsMetric() {
        // basic
        HttpRequestDef.Builder<ListBcsMetricRequest, ListBcsMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBcsMetricRequest.class, ListBcsMetricResponse.class)
                .withName("ListBcsMetric")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/metric/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBcsMetricRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListBcsMetricRequestBody.class,
            f -> f.withMarshaller(ListBcsMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> listBlockchainChannels = genForlistBlockchainChannels();

    private static HttpRequestDef<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> genForlistBlockchainChannels() {
        // basic
        HttpRequestDef.Builder<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBlockchainChannelsRequest.class, ListBlockchainChannelsResponse.class)
                .withName("ListBlockchainChannels")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/channels")
                .withContentType("application/json");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBlockchainChannelsRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBlockchainsRequest, ListBlockchainsResponse> listBlockchains = genForlistBlockchains();

    private static HttpRequestDef<ListBlockchainsRequest, ListBlockchainsResponse> genForlistBlockchains() {
        // basic
        HttpRequestDef.Builder<ListBlockchainsRequest, ListBlockchainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBlockchainsRequest.class, ListBlockchainsResponse.class)
                .withName("ListBlockchains")
                .withUri("/v2/{project_id}/blockchains")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEntityMetricRequest, ListEntityMetricResponse> listEntityMetric = genForlistEntityMetric();

    private static HttpRequestDef<ListEntityMetricRequest, ListEntityMetricResponse> genForlistEntityMetric() {
        // basic
        HttpRequestDef.Builder<ListEntityMetricRequest, ListEntityMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListEntityMetricRequest.class, ListEntityMetricResponse.class)
                .withName("ListEntityMetric")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/entity/metric/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEntityMetricRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListEntityMetricRequestBody.class,
            f -> f.withMarshaller(ListEntityMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceMetricRequest, ListInstanceMetricResponse> listInstanceMetric = genForlistInstanceMetric();

    private static HttpRequestDef<ListInstanceMetricRequest, ListInstanceMetricResponse> genForlistInstanceMetric() {
        // basic
        HttpRequestDef.Builder<ListInstanceMetricRequest, ListInstanceMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstanceMetricRequest.class, ListInstanceMetricResponse.class)
                .withName("ListInstanceMetric")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/entity/instance/metric/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListInstanceMetricRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListInstanceMetricRequestBody.class,
            f -> f.withMarshaller(ListInstanceMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForlistMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForlistMembers() {
        // basic
        HttpRequestDef.Builder<ListMembersRequest, ListMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMembersRequest.class, ListMembersResponse.class)
                .withName("ListMembers")
                .withUri("/v2/{project_id}/members")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> listNotifications = genForlistNotifications();

    private static HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> genForlistNotifications() {
        // basic
        HttpRequestDef.Builder<ListNotificationsRequest, ListNotificationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotificationsRequest.class, ListNotificationsResponse.class)
                .withName("ListNotifications")
                .withUri("/v2/{project_id}/notifications")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> showBlockchainDetail = genForshowBlockchainDetail();

    private static HttpRequestDef<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> genForshowBlockchainDetail() {
        // basic
        HttpRequestDef.Builder<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlockchainDetailRequest.class, ShowBlockchainDetailResponse.class)
                .withName("ShowBlockchainDetail")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBlockchainDetailRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> showBlockchainNodes = genForshowBlockchainNodes();

    private static HttpRequestDef<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> genForshowBlockchainNodes() {
        // basic
        HttpRequestDef.Builder<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlockchainNodesRequest.class, ShowBlockchainNodesResponse.class)
                .withName("ShowBlockchainNodes")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBlockchainNodesRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> showBlockchainStatus = genForshowBlockchainStatus();

    private static HttpRequestDef<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> genForshowBlockchainStatus() {
        // basic
        HttpRequestDef.Builder<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlockchainStatusRequest.class, ShowBlockchainStatusResponse.class)
                .withName("ShowBlockchainStatus")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBlockchainStatusRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance = genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceRequestBody.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
