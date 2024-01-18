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
        genForBatchAddPeersToChannel();

    private static HttpRequestDef<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> genForBatchAddPeersToChannel() {
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
            f -> f.withMarshaller(BatchAddPeersToChannelRequest::getBlockchainId,
                BatchAddPeersToChannelRequest::setBlockchainId));
        builder.<BatchAddPeersToChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddPeersToChannelRequestBody.class),
            f -> f.withMarshaller(BatchAddPeersToChannelRequest::getBody, BatchAddPeersToChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateChannelsRequest, BatchCreateChannelsResponse> batchCreateChannels =
        genForBatchCreateChannels();

    private static HttpRequestDef<BatchCreateChannelsRequest, BatchCreateChannelsResponse> genForBatchCreateChannels() {
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
            f -> f.withMarshaller(BatchCreateChannelsRequest::getBlockchainId,
                BatchCreateChannelsRequest::setBlockchainId));
        builder.<BatchCreateChannelsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateChannelsRequestBody.class),
            f -> f.withMarshaller(BatchCreateChannelsRequest::getBody, BatchCreateChannelsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> batchInviteMembersToChannel =
        genForBatchInviteMembersToChannel();

    private static HttpRequestDef<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> genForBatchInviteMembersToChannel() {
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
            f -> f.withMarshaller(BatchInviteMembersToChannelRequest::getBody,
                BatchInviteMembersToChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> batchRemoveOrgsFromChannel =
        genForBatchRemoveOrgsFromChannel();

    private static HttpRequestDef<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> genForBatchRemoveOrgsFromChannel() {
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
            f -> f.withMarshaller(BatchRemoveOrgsFromChannelRequest::getBlockchainId,
                BatchRemoveOrgsFromChannelRequest::setBlockchainId));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveOrgsFromChannelRequest::getChannelId,
                BatchRemoveOrgsFromChannelRequest::setChannelId));
        builder.<BatchRemoveOrgsFromChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemoveOrgsFromChannelRequestBody.class),
            f -> f.withMarshaller(BatchRemoveOrgsFromChannelRequest::getBody,
                BatchRemoveOrgsFromChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse> batchRemovePeersFromChannel =
        genForBatchRemovePeersFromChannel();

    private static HttpRequestDef<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse> genForBatchRemovePeersFromChannel() {
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
            f -> f.withMarshaller(BatchRemovePeersFromChannelRequest::getBlockchainId,
                BatchRemovePeersFromChannelRequest::setBlockchainId));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemovePeersFromChannelRequest::getChannelId,
                BatchRemovePeersFromChannelRequest::setChannelId));
        builder.<BatchRemovePeersFromChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemovePeersFromChannelRequestBody.class),
            f -> f.withMarshaller(BatchRemovePeersFromChannelRequest::getBody,
                BatchRemovePeersFromChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse> createBlockchainCertByUserName =
        genForCreateBlockchainCertByUserName();

    private static HttpRequestDef<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse> genForCreateBlockchainCertByUserName() {
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
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getBlockchainId,
                CreateBlockchainCertByUserNameRequest::setBlockchainId));
        builder.<String>withRequestField("org_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getOrgName,
                CreateBlockchainCertByUserNameRequest::setOrgName));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getUserName,
                CreateBlockchainCertByUserNameRequest::setUserName));
        builder.<CreateBlockchainCertByUserNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBlockchainCertByUserNameRequestBody.class),
            f -> f.withMarshaller(CreateBlockchainCertByUserNameRequest::getBody,
                CreateBlockchainCertByUserNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewBlockchainRequest, CreateNewBlockchainResponse> createNewBlockchain =
        genForCreateNewBlockchain();

    private static HttpRequestDef<CreateNewBlockchainRequest, CreateNewBlockchainResponse> genForCreateNewBlockchain() {
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
            f -> f.withMarshaller(CreateNewBlockchainRequest::getBody, CreateNewBlockchainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBlockchainRequest, DeleteBlockchainResponse> deleteBlockchain =
        genForDeleteBlockchain();

    private static HttpRequestDef<DeleteBlockchainRequest, DeleteBlockchainResponse> genForDeleteBlockchain() {
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
            f -> f.withMarshaller(DeleteBlockchainRequest::getBlockchainId, DeleteBlockchainRequest::setBlockchainId));
        builder.<Boolean>withRequestField("is_delete_storage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteStorage,
                DeleteBlockchainRequest::setIsDeleteStorage));
        builder.<Boolean>withRequestField("is_delete_obs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteObs, DeleteBlockchainRequest::setIsDeleteObs));
        builder.<Boolean>withRequestField("is_delete_resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteResource,
                DeleteBlockchainRequest::setIsDeleteResource));
        builder.<Boolean>withRequestField("is_delete_ief",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteIef, DeleteBlockchainRequest::setIsDeleteIef));
        builder.<String>withRequestField("is_delete_lightpeer",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIsDeleteLightpeer,
                DeleteBlockchainRequest::setIsDeleteLightpeer));
        builder.<String>withRequestField("ief_nodes_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlockchainRequest::getIefNodesId, DeleteBlockchainRequest::setIefNodesId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteChannelRequest, DeleteChannelResponse> deleteChannel =
        genForDeleteChannel();

    private static HttpRequestDef<DeleteChannelRequest, DeleteChannelResponse> genForDeleteChannel() {
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
            f -> f.withMarshaller(DeleteChannelRequest::getBlockchainId, DeleteChannelRequest::setBlockchainId));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChannelRequest::getChannelId, DeleteChannelRequest::setChannelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberInviteRequest, DeleteMemberInviteResponse> deleteMemberInvite =
        genForDeleteMemberInvite();

    private static HttpRequestDef<DeleteMemberInviteRequest, DeleteMemberInviteResponse> genForDeleteMemberInvite() {
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
            f -> f.withMarshaller(DeleteMemberInviteRequest::getBody, DeleteMemberInviteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> downloadBlockchainCert =
        genForDownloadBlockchainCert();

    private static HttpRequestDef<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> genForDownloadBlockchainCert() {
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
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getBlockchainId,
                DownloadBlockchainCertRequest::setBlockchainId));
        builder.<String>withRequestField("org_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getOrgName,
                DownloadBlockchainCertRequest::setOrgName));
        builder.<DownloadBlockchainCertRequest.CertTypeEnum>withRequestField("cert_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadBlockchainCertRequest.CertTypeEnum.class),
            f -> f.withMarshaller(DownloadBlockchainCertRequest::getCertType,
                DownloadBlockchainCertRequest::setCertType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfig =
        genForDownloadBlockchainSdkConfig();

    private static HttpRequestDef<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> genForDownloadBlockchainSdkConfig() {
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
            f -> f.withMarshaller(DownloadBlockchainSdkConfigRequest::getBlockchainId,
                DownloadBlockchainSdkConfigRequest::setBlockchainId));
        builder.<CfgRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CfgRequestBody.class),
            f -> f.withMarshaller(DownloadBlockchainSdkConfigRequest::getBody,
                DownloadBlockchainSdkConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezeCertRequest, FreezeCertResponse> freezeCert = genForFreezeCert();

    private static HttpRequestDef<FreezeCertRequest, FreezeCertResponse> genForFreezeCert() {
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
            f -> f.withMarshaller(FreezeCertRequest::getUserName, FreezeCertRequest::setUserName));
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeCertRequest::getBlockchainId, FreezeCertRequest::setBlockchainId));
        builder.<String>withRequestField("org_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeCertRequest::getOrgName, FreezeCertRequest::setOrgName));
        builder.<FreezeCertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FreezeCertRequestBody.class),
            f -> f.withMarshaller(FreezeCertRequest::getBody, FreezeCertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleNotificationRequest, HandleNotificationResponse> handleNotification =
        genForHandleNotification();

    private static HttpRequestDef<HandleNotificationRequest, HandleNotificationResponse> genForHandleNotification() {
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
            f -> f.withMarshaller(HandleNotificationRequest::getBody, HandleNotificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse> handleUnionMemberQuitList =
        genForHandleUnionMemberQuitList();

    private static HttpRequestDef<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse> genForHandleUnionMemberQuitList() {
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
            f -> f.withMarshaller(HandleUnionMemberQuitListRequest::getBody,
                HandleUnionMemberQuitListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBcsEventsRequest, ListBcsEventsResponse> listBcsEvents =
        genForListBcsEvents();

    private static HttpRequestDef<ListBcsEventsRequest, ListBcsEventsResponse> genForListBcsEvents() {
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
            f -> f.withMarshaller(ListBcsEventsRequest::getBlockchainId, ListBcsEventsRequest::setBlockchainId));
        builder.<ListBcsEventsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBcsEventsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListBcsEventsRequest::getType, ListBcsEventsRequest::setType));
        builder.<ListBcsEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBcsEventRequestBody.class),
            f -> f.withMarshaller(ListBcsEventsRequest::getBody, ListBcsEventsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse> listBcsEventsStatistic =
        genForListBcsEventsStatistic();

    private static HttpRequestDef<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse> genForListBcsEventsStatistic() {
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
            f -> f.withMarshaller(ListBcsEventsStatisticRequest::getBlockchainId,
                ListBcsEventsStatisticRequest::setBlockchainId));
        builder.<ListBcsEventsStatisticRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBcsEventsStatisticRequest.TypeEnum.class),
            f -> f.withMarshaller(ListBcsEventsStatisticRequest::getType, ListBcsEventsStatisticRequest::setType));
        builder.<ListBcsEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBcsEventRequestBody.class),
            f -> f.withMarshaller(ListBcsEventsStatisticRequest::getBody, ListBcsEventsStatisticRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBcsMetricRequest, ListBcsMetricResponse> listBcsMetric =
        genForListBcsMetric();

    private static HttpRequestDef<ListBcsMetricRequest, ListBcsMetricResponse> genForListBcsMetric() {
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
            f -> f.withMarshaller(ListBcsMetricRequest::getBlockchainId, ListBcsMetricRequest::setBlockchainId));
        builder.<ListBcsMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBcsMetricRequestBody.class),
            f -> f.withMarshaller(ListBcsMetricRequest::getBody, ListBcsMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> listBlockchainChannels =
        genForListBlockchainChannels();

    private static HttpRequestDef<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> genForListBlockchainChannels() {
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
            f -> f.withMarshaller(ListBlockchainChannelsRequest::getBlockchainId,
                ListBlockchainChannelsRequest::setBlockchainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockchainsRequest, ListBlockchainsResponse> listBlockchains =
        genForListBlockchains();

    private static HttpRequestDef<ListBlockchainsRequest, ListBlockchainsResponse> genForListBlockchains() {
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
        genForListEntityMetric();

    private static HttpRequestDef<ListEntityMetricRequest, ListEntityMetricResponse> genForListEntityMetric() {
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
            f -> f.withMarshaller(ListEntityMetricRequest::getBlockchainId, ListEntityMetricRequest::setBlockchainId));
        builder.<ListEntityMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListEntityMetricRequestBody.class),
            f -> f.withMarshaller(ListEntityMetricRequest::getBody, ListEntityMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceMetricRequest, ListInstanceMetricResponse> listInstanceMetric =
        genForListInstanceMetric();

    private static HttpRequestDef<ListInstanceMetricRequest, ListInstanceMetricResponse> genForListInstanceMetric() {
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
            f -> f.withMarshaller(ListInstanceMetricRequest::getBlockchainId,
                ListInstanceMetricRequest::setBlockchainId));
        builder.<ListInstanceMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceMetricRequestBody.class),
            f -> f.withMarshaller(ListInstanceMetricRequest::getBody, ListInstanceMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForListMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForListMembers() {
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
        genForListNotifications();

    private static HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> genForListNotifications() {
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

    public static final HttpRequestDef<ListOpRecordRequest, ListOpRecordResponse> listOpRecord = genForListOpRecord();

    private static HttpRequestDef<ListOpRecordRequest, ListOpRecordResponse> genForListOpRecord() {
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
            f -> f.withMarshaller(ListOpRecordRequest::getBlockchainId, ListOpRecordRequest::setBlockchainId));
        builder.<ListOpRecordRequest.OperationStatusEnum>withRequestField("operation_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpRecordRequest.OperationStatusEnum.class),
            f -> f.withMarshaller(ListOpRecordRequest::getOperationStatus, ListOpRecordRequest::setOperationStatus));
        builder.<ListOpRecordRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpRecordRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListOpRecordRequest::getResourceType, ListOpRecordRequest::setResourceType));
        builder.<ListOpRecordRequest.OperationTypeEnum>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpRecordRequest.OperationTypeEnum.class),
            f -> f.withMarshaller(ListOpRecordRequest::getOperationType, ListOpRecordRequest::setOperationType));
        builder.<String>withRequestField("operation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpRecordRequest::getOperationId, ListOpRecordRequest::setOperationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
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
        genForShowBlockchainDetail();

    private static HttpRequestDef<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> genForShowBlockchainDetail() {
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
            f -> f.withMarshaller(ShowBlockchainDetailRequest::getBlockchainId,
                ShowBlockchainDetailRequest::setBlockchainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> showBlockchainFlavors =
        genForShowBlockchainFlavors();

    private static HttpRequestDef<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> genForShowBlockchainFlavors() {
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
            f -> f.withMarshaller(ShowBlockchainFlavorsRequest::getLimit, ShowBlockchainFlavorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBlockchainFlavorsRequest::getOffset, ShowBlockchainFlavorsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> showBlockchainNodes =
        genForShowBlockchainNodes();

    private static HttpRequestDef<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> genForShowBlockchainNodes() {
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
            f -> f.withMarshaller(ShowBlockchainNodesRequest::getBlockchainId,
                ShowBlockchainNodesRequest::setBlockchainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> showBlockchainStatus =
        genForShowBlockchainStatus();

    private static HttpRequestDef<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> genForShowBlockchainStatus() {
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
            f -> f.withMarshaller(ShowBlockchainStatusRequest::getBlockchainId,
                ShowBlockchainStatusRequest::setBlockchainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeCertRequest, UnfreezeCertResponse> unfreezeCert = genForUnfreezeCert();

    private static HttpRequestDef<UnfreezeCertRequest, UnfreezeCertResponse> genForUnfreezeCert() {
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
            f -> f.withMarshaller(UnfreezeCertRequest::getUserName, UnfreezeCertRequest::setUserName));
        builder.<String>withRequestField("blockchain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeCertRequest::getBlockchainId, UnfreezeCertRequest::setBlockchainId));
        builder.<String>withRequestField("org_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeCertRequest::getOrgName, UnfreezeCertRequest::setOrgName));
        builder.<UnfreezeCertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UnfreezeCertRequestBody.class),
            f -> f.withMarshaller(UnfreezeCertRequest::getBody, UnfreezeCertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
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
            f -> f.withMarshaller(UpdateInstanceRequest::getBlockchainId, UpdateInstanceRequest::setBlockchainId));
        builder.<UpdateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

}
