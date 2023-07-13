package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.bcs.v2.model.BatchAddPeersToChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchAddPeersToChannelRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.BatchAddPeersToChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchCreateChannelsRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchCreateChannelsRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.BatchCreateChannelsResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchInviteMembersToChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchInviteMembersToChannelRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.BatchInviteMembersToChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemoveOrgsFromChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemoveOrgsFromChannelRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemoveOrgsFromChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemovePeersFromChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemovePeersFromChannelRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemovePeersFromChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.CfgRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.CreateBlockchainCertByUserNameRequest;
import com.huaweicloud.sdk.bcs.v2.model.CreateBlockchainCertByUserNameRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.CreateBlockchainCertByUserNameResponse;
import com.huaweicloud.sdk.bcs.v2.model.CreateNewBlockchainRequest;
import com.huaweicloud.sdk.bcs.v2.model.CreateNewBlockchainResponse;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.DeleteBlockchainRequest;
import com.huaweicloud.sdk.bcs.v2.model.DeleteBlockchainResponse;
import com.huaweicloud.sdk.bcs.v2.model.DeleteChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.DeleteChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.DeleteMemberInviteRequest;
import com.huaweicloud.sdk.bcs.v2.model.DeleteMemberInviteRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.DeleteMemberInviteResponse;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainCertRequest;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainCertResponse;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainSdkConfigRequest;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainSdkConfigResponse;
import com.huaweicloud.sdk.bcs.v2.model.FreezeCertRequest;
import com.huaweicloud.sdk.bcs.v2.model.FreezeCertRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.FreezeCertResponse;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationRequest;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationResponse;
import com.huaweicloud.sdk.bcs.v2.model.HandleUnionMemberQuitListRequest;
import com.huaweicloud.sdk.bcs.v2.model.HandleUnionMemberQuitListResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsStatisticRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsStatisticResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsMetricRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsMetricRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsMetricResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainChannelsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainChannelsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListEntityMetricRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListEntityMetricRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.ListEntityMetricResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListInstanceMetricRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListInstanceMetricRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.ListInstanceMetricResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListMembersRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListMembersResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListNotificationsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListNotificationsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListOpRecordRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListOpRecordResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.bcs.v2.model.QuitUnionFromMemberListRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainDetailRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainDetailResponse;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainFlavorsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainFlavorsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainNodesRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainNodesResponse;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainStatusRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainStatusResponse;
import com.huaweicloud.sdk.bcs.v2.model.UnfreezeCertRequest;
import com.huaweicloud.sdk.bcs.v2.model.UnfreezeCertRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.UnfreezeCertResponse;
import com.huaweicloud.sdk.bcs.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.bcs.v2.model.UpdateInstanceRequestBody;
import com.huaweicloud.sdk.bcs.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class BcsMeta {

    public static final HttpRequestDef<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> batchAddPeersToChannel =
        genForbatchAddPeersToChannel();

    private static HttpRequestDef<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> genForbatchAddPeersToChannel() {
        // basic
        HttpRequestDef.Builder<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddPeersToChannelRequest.class, BatchAddPeersToChannelResponse.class)
            .withName("BatchAddPeersToChannel")
            .withUri("/v2/{project_id}/blockchains/{blockchain_id}/channels/peers")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddPeersToChannelRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<BatchAddPeersToChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddPeersToChannelRequestBody.class),
            f -> f.withMarshaller(BatchAddPeersToChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateChannelsRequest, BatchCreateChannelsResponse> batchCreateChannels =
        genForbatchCreateChannels();

    private static HttpRequestDef<BatchCreateChannelsRequest, BatchCreateChannelsResponse> genForbatchCreateChannels() {
        // basic
        HttpRequestDef.Builder<BatchCreateChannelsRequest, BatchCreateChannelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateChannelsRequest.class, BatchCreateChannelsResponse.class)
                .withName("BatchCreateChannels")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/channels")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateChannelsRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<BatchCreateChannelsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateChannelsRequestBody.class),
            f -> f.withMarshaller(BatchCreateChannelsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> batchInviteMembersToChannel =
        genForbatchInviteMembersToChannel();

    private static HttpRequestDef<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> genForbatchInviteMembersToChannel() {
        // basic
        HttpRequestDef.Builder<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchInviteMembersToChannelRequest.class,
                    BatchInviteMembersToChannelResponse.class)
                .withName("BatchInviteMembersToChannel")
                .withUri("/v2/{project_id}/members/invitations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchInviteMembersToChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchInviteMembersToChannelRequestBody.class),
            f -> f.withMarshaller(BatchInviteMembersToChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> batchRemoveOrgsFromChannel =
        genForbatchRemoveOrgsFromChannel();

    private static HttpRequestDef<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> genForbatchRemoveOrgsFromChannel() {
        // basic
        HttpRequestDef.Builder<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchRemoveOrgsFromChannelRequest.class,
                    BatchRemoveOrgsFromChannelResponse.class)
                .withName("BatchRemoveOrgsFromChannel")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/{channel_id}/orgs/quit")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveOrgsFromChannelRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveOrgsFromChannelRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
        builder.<BatchRemoveOrgsFromChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemoveOrgsFromChannelRequestBody.class),
            f -> f.withMarshaller(BatchRemoveOrgsFromChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse> batchRemovePeersFromChannel =
        genForbatchRemovePeersFromChannel();

    private static HttpRequestDef<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse> genForbatchRemovePeersFromChannel() {
        // basic
        HttpRequestDef.Builder<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchRemovePeersFromChannelRequest.class,
                    BatchRemovePeersFromChannelResponse.class)
                .withName("BatchRemovePeersFromChannel")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/{channel_id}/peers/quit")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemovePeersFromChannelRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemovePeersFromChannelRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
        builder.<BatchRemovePeersFromChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemovePeersFromChannelRequestBody.class),
            f -> f.withMarshaller(BatchRemovePeersFromChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse> createBlockchainCertByUserName =
        genForcreateBlockchainCertByUserName();

    private static HttpRequestDef<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse> genForcreateBlockchainCertByUserName() {
        // basic
        HttpRequestDef.Builder<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateBlockchainCertByUserNameRequest.class,
                    CreateBlockchainCertByUserNameResponse.class)
                .withName("CreateBlockchainCertByUserName")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/orgs/{org_name}/usercert/{user_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<String>withRequestField("org_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getOrgName, (req, v) -> {
                req.setOrgName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<CreateBlockchainCertByUserNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBlockchainCertByUserNameRequestBody.class),
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewBlockchainRequest, CreateNewBlockchainResponse> createNewBlockchain =
        genForcreateNewBlockchain();

    private static HttpRequestDef<CreateNewBlockchainRequest, CreateNewBlockchainResponse> genForcreateNewBlockchain() {
        // basic
        HttpRequestDef.Builder<CreateNewBlockchainRequest, CreateNewBlockchainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNewBlockchainRequest.class, CreateNewBlockchainResponse.class)
                .withName("CreateNewBlockchain")
                .withUri("/v2/{project_id}/blockchains")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRequestBody.class),
            f -> f.withMarshaller(CreateNewBlockchainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBlockchainRequest, DeleteBlockchainResponse> deleteBlockchain =
        genFordeleteBlockchain();

    private static HttpRequestDef<DeleteBlockchainRequest, DeleteBlockchainResponse> genFordeleteBlockchain() {
        // basic
        HttpRequestDef.Builder<DeleteBlockchainRequest, DeleteBlockchainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBlockchainRequest.class, DeleteBlockchainResponse.class)
                .withName("DeleteBlockchain")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<Boolean>withRequestField("is_delete_storage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteStorage, (req, v) -> {
                req.setIsDeleteStorage(v);
            }));
        builder.<Boolean>withRequestField("is_delete_obs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteObs, (req, v) -> {
                req.setIsDeleteObs(v);
            }));
        builder.<Boolean>withRequestField("is_delete_resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteResource, (req, v) -> {
                req.setIsDeleteResource(v);
            }));
        builder.<Boolean>withRequestField("is_delete_ief",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteIef, (req, v) -> {
                req.setIsDeleteIef(v);
            }));
        builder.<String>withRequestField("is_delete_lightpeer",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteLightpeer, (req, v) -> {
                req.setIsDeleteLightpeer(v);
            }));
        builder.<String>withRequestField("ief_nodes_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIefNodesId, (req, v) -> {
                req.setIefNodesId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteChannelRequest, DeleteChannelResponse> deleteChannel =
        genFordeleteChannel();

    private static HttpRequestDef<DeleteChannelRequest, DeleteChannelResponse> genFordeleteChannel() {
        // basic
        HttpRequestDef.Builder<DeleteChannelRequest, DeleteChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteChannelRequest.class, DeleteChannelResponse.class)
                .withName("DeleteChannel")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/channel/{channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChannelRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChannelRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberInviteRequest, DeleteMemberInviteResponse> deleteMemberInvite =
        genFordeleteMemberInvite();

    private static HttpRequestDef<DeleteMemberInviteRequest, DeleteMemberInviteResponse> genFordeleteMemberInvite() {
        // basic
        HttpRequestDef.Builder<DeleteMemberInviteRequest, DeleteMemberInviteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberInviteRequest.class, DeleteMemberInviteResponse.class)
                .withName("DeleteMemberInvite")
                .withUri("/v2/{project_id}/members/invitations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteMemberInviteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteMemberInviteRequestBody.class),
            f -> f.withMarshaller(DeleteMemberInviteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> downloadBlockchainCert =
        genFordownloadBlockchainCert();

    private static HttpRequestDef<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> genFordownloadBlockchainCert() {
        // basic
        HttpRequestDef.Builder<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadBlockchainCertRequest.class, DownloadBlockchainCertResponse.class)
            .withName("DownloadBlockchainCert")
            .withUri("/v2/{project_id}/blockchains/{blockchain_id}/cert")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<String>withRequestField("org_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getOrgName, (req, v) -> {
                req.setOrgName(v);
            }));
        builder.<DownloadBlockchainCertRequest.CertTypeEnum>withRequestField("cert_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadBlockchainCertRequest.CertTypeEnum.class),
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getCertType, (req, v) -> {
                req.setCertType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfig =
        genFordownloadBlockchainSdkConfig();

    private static HttpRequestDef<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> genFordownloadBlockchainSdkConfig() {
        // basic
        HttpRequestDef.Builder<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DownloadBlockchainSdkConfigRequest.class,
                    DownloadBlockchainSdkConfigResponse.class)
                .withName("DownloadBlockchainSdkConfig")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/sdk-cfg")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBlockchainSdkConfigRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<CfgRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CfgRequestBody.class),
            f -> f.withMarshaller(DownloadBlockchainSdkConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezeCertRequest, FreezeCertResponse> freezeCert = genForfreezeCert();

    private static HttpRequestDef<FreezeCertRequest, FreezeCertResponse> genForfreezeCert() {
        // basic
        HttpRequestDef.Builder<FreezeCertRequest, FreezeCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezeCertRequest.class, FreezeCertResponse.class)
                .withName("FreezeCert")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/orgs/{org_name}/usercert/{user_name}/freeze")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeCertRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeCertRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<String>withRequestField("org_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeCertRequest::getOrgName, (req, v) -> {
                req.setOrgName(v);
            }));
        builder.<FreezeCertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FreezeCertRequestBody.class),
            f -> f.withMarshaller(FreezeCertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleNotificationRequest, HandleNotificationResponse> handleNotification =
        genForhandleNotification();

    private static HttpRequestDef<HandleNotificationRequest, HandleNotificationResponse> genForhandleNotification() {
        // basic
        HttpRequestDef.Builder<HandleNotificationRequest, HandleNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HandleNotificationRequest.class, HandleNotificationResponse.class)
                .withName("HandleNotification")
                .withUri("/v2/{project_id}/notification/handle")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<HandleNotificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HandleNotificationRequestBody.class),
            f -> f.withMarshaller(HandleNotificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse> handleUnionMemberQuitList =
        genForhandleUnionMemberQuitList();

    private static HttpRequestDef<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse> genForhandleUnionMemberQuitList() {
        // basic
        HttpRequestDef.Builder<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    HandleUnionMemberQuitListRequest.class,
                    HandleUnionMemberQuitListResponse.class)
                .withName("HandleUnionMemberQuitList")
                .withUri("/v2/{project_id}/members/quit")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<QuitUnionFromMemberListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuitUnionFromMemberListRequestBody.class),
            f -> f.withMarshaller(HandleUnionMemberQuitListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBcsEventsRequest, ListBcsEventsResponse> listBcsEvents =
        genForlistBcsEvents();

    private static HttpRequestDef<ListBcsEventsRequest, ListBcsEventsResponse> genForlistBcsEvents() {
        // basic
        HttpRequestDef.Builder<ListBcsEventsRequest, ListBcsEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBcsEventsRequest.class, ListBcsEventsResponse.class)
                .withName("ListBcsEvents")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/events")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBcsEventsRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<ListBcsEventsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBcsEventsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListBcsEventsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ListBcsEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBcsEventRequestBody.class),
            f -> f.withMarshaller(ListBcsEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse> listBcsEventsStatistic =
        genForlistBcsEventsStatistic();

    private static HttpRequestDef<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse> genForlistBcsEventsStatistic() {
        // basic
        HttpRequestDef.Builder<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListBcsEventsStatisticRequest.class, ListBcsEventsStatisticResponse.class)
            .withName("ListBcsEventsStatistic")
            .withUri("/v2/{project_id}/blockchains/{blockchain_id}/events/statistic")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBcsEventsStatisticRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<ListBcsEventsStatisticRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBcsEventsStatisticRequest.TypeEnum.class),
            f -> f.withMarshaller(ListBcsEventsStatisticRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ListBcsEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBcsEventRequestBody.class),
            f -> f.withMarshaller(ListBcsEventsStatisticRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBcsMetricRequest, ListBcsMetricResponse> listBcsMetric =
        genForlistBcsMetric();

    private static HttpRequestDef<ListBcsMetricRequest, ListBcsMetricResponse> genForlistBcsMetric() {
        // basic
        HttpRequestDef.Builder<ListBcsMetricRequest, ListBcsMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBcsMetricRequest.class, ListBcsMetricResponse.class)
                .withName("ListBcsMetric")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/metric/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBcsMetricRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<ListBcsMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBcsMetricRequestBody.class),
            f -> f.withMarshaller(ListBcsMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> listBlockchainChannels =
        genForlistBlockchainChannels();

    private static HttpRequestDef<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> genForlistBlockchainChannels() {
        // basic
        HttpRequestDef.Builder<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBlockchainChannelsRequest.class, ListBlockchainChannelsResponse.class)
            .withName("ListBlockchainChannels")
            .withUri("/v2/{project_id}/blockchains/{blockchain_id}/channels")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockchainChannelsRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockchainsRequest, ListBlockchainsResponse> listBlockchains =
        genForlistBlockchains();

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

    public static final HttpRequestDef<ListEntityMetricRequest, ListEntityMetricResponse> listEntityMetric =
        genForlistEntityMetric();

    private static HttpRequestDef<ListEntityMetricRequest, ListEntityMetricResponse> genForlistEntityMetric() {
        // basic
        HttpRequestDef.Builder<ListEntityMetricRequest, ListEntityMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListEntityMetricRequest.class, ListEntityMetricResponse.class)
                .withName("ListEntityMetric")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/entity/metric/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntityMetricRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<ListEntityMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListEntityMetricRequestBody.class),
            f -> f.withMarshaller(ListEntityMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceMetricRequest, ListInstanceMetricResponse> listInstanceMetric =
        genForlistInstanceMetric();

    private static HttpRequestDef<ListInstanceMetricRequest, ListInstanceMetricResponse> genForlistInstanceMetric() {
        // basic
        HttpRequestDef.Builder<ListInstanceMetricRequest, ListInstanceMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstanceMetricRequest.class, ListInstanceMetricResponse.class)
                .withName("ListInstanceMetric")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/entity/instance/metric/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceMetricRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<ListInstanceMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceMetricRequestBody.class),
            f -> f.withMarshaller(ListInstanceMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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

    public static final HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> listNotifications =
        genForlistNotifications();

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

    public static final HttpRequestDef<ListOpRecordRequest, ListOpRecordResponse> listOpRecord = genForlistOpRecord();

    private static HttpRequestDef<ListOpRecordRequest, ListOpRecordResponse> genForlistOpRecord() {
        // basic
        HttpRequestDef.Builder<ListOpRecordRequest, ListOpRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOpRecordRequest.class, ListOpRecordResponse.class)
                .withName("ListOpRecord")
                .withUri("/v2/{project_id}/operation/record")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpRecordRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<ListOpRecordRequest.OperationStatusEnum>withRequestField("operation_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpRecordRequest.OperationStatusEnum.class),
            f -> f.withMarshaller(ListOpRecordRequest::getOperationStatus, (req, v) -> {
                req.setOperationStatus(v);
            }));
        builder.<ListOpRecordRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpRecordRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListOpRecordRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListOpRecordRequest.OperationTypeEnum>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpRecordRequest.OperationTypeEnum.class),
            f -> f.withMarshaller(ListOpRecordRequest::getOperationType, (req, v) -> {
                req.setOperationType(v);
            }));
        builder.<String>withRequestField("operation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpRecordRequest::getOperationId, (req, v) -> {
                req.setOperationId(v);
            }));

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

    public static final HttpRequestDef<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> showBlockchainDetail =
        genForshowBlockchainDetail();

    private static HttpRequestDef<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> genForshowBlockchainDetail() {
        // basic
        HttpRequestDef.Builder<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBlockchainDetailRequest.class, ShowBlockchainDetailResponse.class)
            .withName("ShowBlockchainDetail")
            .withUri("/v2/{project_id}/blockchains/{blockchain_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlockchainDetailRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> showBlockchainFlavors =
        genForshowBlockchainFlavors();

    private static HttpRequestDef<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> genForshowBlockchainFlavors() {
        // basic
        HttpRequestDef.Builder<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBlockchainFlavorsRequest.class, ShowBlockchainFlavorsResponse.class)
            .withName("ShowBlockchainFlavors")
            .withUri("/v2/{project_id}/blockchains/flavors")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBlockchainFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBlockchainFlavorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> showBlockchainNodes =
        genForshowBlockchainNodes();

    private static HttpRequestDef<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> genForshowBlockchainNodes() {
        // basic
        HttpRequestDef.Builder<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlockchainNodesRequest.class, ShowBlockchainNodesResponse.class)
                .withName("ShowBlockchainNodes")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlockchainNodesRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> showBlockchainStatus =
        genForshowBlockchainStatus();

    private static HttpRequestDef<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> genForshowBlockchainStatus() {
        // basic
        HttpRequestDef.Builder<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBlockchainStatusRequest.class, ShowBlockchainStatusResponse.class)
            .withName("ShowBlockchainStatus")
            .withUri("/v2/{project_id}/blockchains/{blockchain_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlockchainStatusRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeCertRequest, UnfreezeCertResponse> unfreezeCert = genForunfreezeCert();

    private static HttpRequestDef<UnfreezeCertRequest, UnfreezeCertResponse> genForunfreezeCert() {
        // basic
        HttpRequestDef.Builder<UnfreezeCertRequest, UnfreezeCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnfreezeCertRequest.class, UnfreezeCertResponse.class)
                .withName("UnfreezeCert")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}/orgs/{org_name}/usercert/{user_name}/unfreeze")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeCertRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeCertRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<String>withRequestField("org_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeCertRequest::getOrgName, (req, v) -> {
                req.setOrgName(v);
            }));
        builder.<UnfreezeCertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UnfreezeCertRequestBody.class),
            f -> f.withMarshaller(UnfreezeCertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/{project_id}/blockchains/{blockchain_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBlockchainId, (req, v) -> {
                req.setBlockchainId(v);
            }));
        builder.<UpdateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
