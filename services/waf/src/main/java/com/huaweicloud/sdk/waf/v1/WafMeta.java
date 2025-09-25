package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.waf.v1.model.AccessProgress;
import com.huaweicloud.sdk.waf.v1.model.AccessStatusBody;
import com.huaweicloud.sdk.waf.v1.model.AlertNoticeConfig;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostResponse;
import com.huaweicloud.sdk.waf.v1.model.AsyncJobReqBody;
import com.huaweicloud.sdk.waf.v1.model.BandwidthStatisticsTimelineItem;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteCcRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteCcRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteCompositeHostsRequestBody;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeletePoliciesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeletePoliciesRequestBody;
import com.huaweicloud.sdk.waf.v1.model.BatchDeletePoliciesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateBotMRuleActionRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateBotMRuleActionRequestBody;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateBotMRuleActionResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateGeoipRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateGeoipRulesRequestBody;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateGeoipRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafRequestBody;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CheckAgencyRequest;
import com.huaweicloud.sdk.waf.v1.model.CheckAgencyResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyAntileakageMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyAntileakageMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyIpReputationMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyIpReputationMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmThreatMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmThreatMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmUserBundleRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmUserBundleResponse;
import com.huaweicloud.sdk.waf.v1.model.CopyPolicyByIdRequest;
import com.huaweicloud.sdk.waf.v1.model.CopyPolicyByIdResponse;
import com.huaweicloud.sdk.waf.v1.model.CountItem;
import com.huaweicloud.sdk.waf.v1.model.CreateAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRulesRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleRequestbody;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceRequestbody;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateEventExportJobRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateEventExportJobResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoIpRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIpReputationRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateQuickAccessDomainRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateQuickAccessDomainResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateSecurityReportSubscriptionRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteBlackIpRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntiTamperPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntiTamperPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakagePolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakagePolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAttackActionTypesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAttackActionTypesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBotMRequestDistributionRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBotMRequestDistributionResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBotMRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBotMRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBotMScoreDistributionRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBotMScoreDistributionResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBotMTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBotMTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBotMTopnRequestRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBotMTopnRequestResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCcPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCcPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCustomPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCustomPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ListEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ListGeoIpPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListGeoIpPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIgnorePolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIgnorePolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListLlmGuardPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListLlmGuardPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationRequest;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListProtectableResourcesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListProtectableResourcesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListResponseCodeTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListResponseCodeTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportHistoryPeriodsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportHistoryPeriodsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSendingRecordsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSendingRecordsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSubscriptionsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSubscriptionsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopDomainsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopDomainsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopIpRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopIpResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopUrlRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopUrlResponse;
import com.huaweicloud.sdk.waf.v1.model.ListValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ListValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWebBasicProtectionRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWebBasicProtectionRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsRequestBody;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.PolicyRuleIdRequestBody;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceRequestBody;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.RouteBody;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowHostStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowHostStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyGeoipMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyGeoipMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportContentRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportContentResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowWebProtectionRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowWebProtectionRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.StatisticsTimelineItem;
import com.huaweicloud.sdk.waf.v1.model.TypedStatBucket;
import com.huaweicloud.sdk.waf.v1.model.UpdateAccessProgressRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAccessProgressResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeRequestbody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateBotMCategoryStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateBotMCategoryStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateBotMRuleDefenseStrategyRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateBotMRuleDefenseStrategyRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateBotMRuleDefenseStrategyResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateBotMRuleStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostAccessStatusOfUnderlineRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostAccessStatusOfUnderlineResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateInstanceRouteRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateInstanceRouteResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpReputationRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostAccessStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostAccessStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostAccessStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateSecurityReportSubscriptionRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteBlackIpRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class WafMeta {

    public static final HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHost =
        genForApplyCertificateToHost();

    private static HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> genForApplyCertificateToHost() {
        // basic
        HttpRequestDef.Builder<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplyCertificateToHostRequest.class, ApplyCertificateToHostResponse.class)
            .withName("ApplyCertificateToHost")
            .withUri("/v1/{project_id}/waf/certificate/{certificate_id}/apply-to-hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getCertificateId,
                ApplyCertificateToHostRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getEnterpriseProjectId,
                ApplyCertificateToHostRequest::setEnterpriseProjectId));
        builder.<ApplyCertificateToHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplyCertificateToHostRequestBody.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getBody, ApplyCertificateToHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCcRulesRequest, BatchDeleteCcRulesResponse> batchDeleteCcRules =
        genForBatchDeleteCcRules();

    private static HttpRequestDef<BatchDeleteCcRulesRequest, BatchDeleteCcRulesResponse> genForBatchDeleteCcRules() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCcRulesRequest, BatchDeleteCcRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteCcRulesRequest.class, BatchDeleteCcRulesResponse.class)
                .withName("BatchDeleteCcRules")
                .withUri("/v1/{project_id}/waf/rule/cc/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<PolicyRuleIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PolicyRuleIdRequestBody.class),
            f -> f.withMarshaller(BatchDeleteCcRulesRequest::getBody, BatchDeleteCcRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCompositeHostsRequest, BatchDeleteCompositeHostsResponse> batchDeleteCompositeHosts =
        genForBatchDeleteCompositeHosts();

    private static HttpRequestDef<BatchDeleteCompositeHostsRequest, BatchDeleteCompositeHostsResponse> genForBatchDeleteCompositeHosts() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCompositeHostsRequest, BatchDeleteCompositeHostsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteCompositeHostsRequest.class,
                    BatchDeleteCompositeHostsResponse.class)
                .withName("BatchDeleteCompositeHosts")
                .withUri("/v1/{project_id}/composite-waf/hosts/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCompositeHostsRequest::getEnterpriseProjectId,
                BatchDeleteCompositeHostsRequest::setEnterpriseProjectId));
        builder.<BatchDeleteCompositeHostsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteCompositeHostsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteCompositeHostsRequest::getBody,
                BatchDeleteCompositeHostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePoliciesRequest, BatchDeletePoliciesResponse> batchDeletePolicies =
        genForBatchDeletePolicies();

    private static HttpRequestDef<BatchDeletePoliciesRequest, BatchDeletePoliciesResponse> genForBatchDeletePolicies() {
        // basic
        HttpRequestDef.Builder<BatchDeletePoliciesRequest, BatchDeletePoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeletePoliciesRequest.class, BatchDeletePoliciesResponse.class)
                .withName("BatchDeletePolicies")
                .withUri("/v1/{project_id}/waf/policies/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePoliciesRequest::getEnterpriseProjectId,
                BatchDeletePoliciesRequest::setEnterpriseProjectId));
        builder.<BatchDeletePoliciesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePoliciesRequestBody.class),
            f -> f.withMarshaller(BatchDeletePoliciesRequest::getBody, BatchDeletePoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateBotMRuleActionRequest, BatchUpdateBotMRuleActionResponse> batchUpdateBotMRuleAction =
        genForBatchUpdateBotMRuleAction();

    private static HttpRequestDef<BatchUpdateBotMRuleActionRequest, BatchUpdateBotMRuleActionResponse> genForBatchUpdateBotMRuleAction() {
        // basic
        HttpRequestDef.Builder<BatchUpdateBotMRuleActionRequest, BatchUpdateBotMRuleActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUpdateBotMRuleActionRequest.class,
                    BatchUpdateBotMRuleActionResponse.class)
                .withName("BatchUpdateBotMRuleAction")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/bot-manager/rule/batch-update-action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateBotMRuleActionRequest::getPolicyId,
                BatchUpdateBotMRuleActionRequest::setPolicyId));
        builder.<BatchUpdateBotMRuleActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateBotMRuleActionRequestBody.class),
            f -> f.withMarshaller(BatchUpdateBotMRuleActionRequest::getBody,
                BatchUpdateBotMRuleActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateGeoipRulesRequest, BatchUpdateGeoipRulesResponse> batchUpdateGeoipRules =
        genForBatchUpdateGeoipRules();

    private static HttpRequestDef<BatchUpdateGeoipRulesRequest, BatchUpdateGeoipRulesResponse> genForBatchUpdateGeoipRules() {
        // basic
        HttpRequestDef.Builder<BatchUpdateGeoipRulesRequest, BatchUpdateGeoipRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateGeoipRulesRequest.class, BatchUpdateGeoipRulesResponse.class)
            .withName("BatchUpdateGeoipRules")
            .withUri("/v1/{project_id}/waf/rule/geoip/batch-update")
            .withContentType("application/json");

        // requests
        builder.<BatchUpdateGeoipRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchUpdateGeoipRulesRequestBody.class),
            f -> f.withMarshaller(BatchUpdateGeoipRulesRequest::getBody, BatchUpdateGeoipRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> changePrepaidCloudWaf =
        genForChangePrepaidCloudWaf();

    private static HttpRequestDef<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> genForChangePrepaidCloudWaf() {
        // basic
        HttpRequestDef.Builder<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangePrepaidCloudWafRequest.class, ChangePrepaidCloudWafResponse.class)
            .withName("ChangePrepaidCloudWaf")
            .withUri("/v1/{project_id}/waf/subscription/batchalter/prepaid-cloud-waf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePrepaidCloudWafRequest::getEnterpriseProjectId,
                ChangePrepaidCloudWafRequest::setEnterpriseProjectId));
        builder.<ChangePrepaidCloudWafRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePrepaidCloudWafRequestBody.class),
            f -> f.withMarshaller(ChangePrepaidCloudWafRequest::getBody, ChangePrepaidCloudWafRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAgencyRequest, CheckAgencyResponse> checkAgency = genForCheckAgency();

    private static HttpRequestDef<CheckAgencyRequest, CheckAgencyResponse> genForCheckAgency() {
        // basic
        HttpRequestDef.Builder<CheckAgencyRequest, CheckAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAgencyRequest.class, CheckAgencyResponse.class)
                .withName("CheckAgency")
                .withUri("/v1/{project_id}/premium-waf/agency")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmIpReputationRuleRequest, ConfirmIpReputationRuleResponse> confirmIpReputationRule =
        genForConfirmIpReputationRule();

    private static HttpRequestDef<ConfirmIpReputationRuleRequest, ConfirmIpReputationRuleResponse> genForConfirmIpReputationRule() {
        // basic
        HttpRequestDef.Builder<ConfirmIpReputationRuleRequest, ConfirmIpReputationRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ConfirmIpReputationRuleRequest.class, ConfirmIpReputationRuleResponse.class)
            .withName("ConfirmIpReputationRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/ip-reputation/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmIpReputationRuleRequest::getPolicyId,
                ConfirmIpReputationRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmIpReputationRuleRequest::getRuleId,
                ConfirmIpReputationRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmPolicyAntileakageMapRequest, ConfirmPolicyAntileakageMapResponse> confirmPolicyAntileakageMap =
        genForConfirmPolicyAntileakageMap();

    private static HttpRequestDef<ConfirmPolicyAntileakageMapRequest, ConfirmPolicyAntileakageMapResponse> genForConfirmPolicyAntileakageMap() {
        // basic
        HttpRequestDef.Builder<ConfirmPolicyAntileakageMapRequest, ConfirmPolicyAntileakageMapResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ConfirmPolicyAntileakageMapRequest.class,
                    ConfirmPolicyAntileakageMapResponse.class)
                .withName("ConfirmPolicyAntileakageMap")
                .withUri("/v1/{project_id}/waf/tag/antileakage/map")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("lang",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmPolicyAntileakageMapRequest::getLang,
                ConfirmPolicyAntileakageMapRequest::setLang));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmPolicyIpReputationMapRequest, ConfirmPolicyIpReputationMapResponse> confirmPolicyIpReputationMap =
        genForConfirmPolicyIpReputationMap();

    private static HttpRequestDef<ConfirmPolicyIpReputationMapRequest, ConfirmPolicyIpReputationMapResponse> genForConfirmPolicyIpReputationMap() {
        // basic
        HttpRequestDef.Builder<ConfirmPolicyIpReputationMapRequest, ConfirmPolicyIpReputationMapResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ConfirmPolicyIpReputationMapRequest.class,
                    ConfirmPolicyIpReputationMapResponse.class)
                .withName("ConfirmPolicyIpReputationMap")
                .withUri("/v1/{project_id}/waf/tag/ip-reputation/map")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("lang",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmPolicyIpReputationMapRequest::getLang,
                ConfirmPolicyIpReputationMapRequest::setLang));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmPolicyIpReputationMapRequest::getType,
                ConfirmPolicyIpReputationMapRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmThreatMapRequest, ConfirmThreatMapResponse> confirmThreatMap =
        genForConfirmThreatMap();

    private static HttpRequestDef<ConfirmThreatMapRequest, ConfirmThreatMapResponse> genForConfirmThreatMap() {
        // basic
        HttpRequestDef.Builder<ConfirmThreatMapRequest, ConfirmThreatMapResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ConfirmThreatMapRequest.class, ConfirmThreatMapResponse.class)
                .withName("ConfirmThreatMap")
                .withUri("/v1/{project_id}/waf/tag/threat/map")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmUserBundleRequest, ConfirmUserBundleResponse> confirmUserBundle =
        genForConfirmUserBundle();

    private static HttpRequestDef<ConfirmUserBundleRequest, ConfirmUserBundleResponse> genForConfirmUserBundle() {
        // basic
        HttpRequestDef.Builder<ConfirmUserBundleRequest, ConfirmUserBundleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ConfirmUserBundleRequest.class, ConfirmUserBundleResponse.class)
                .withName("ConfirmUserBundle")
                .withUri("/v1/{project_id}/waf/bundle")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmUserBundleRequest::getEnterpriseProjectId,
                ConfirmUserBundleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyPolicyByIdRequest, CopyPolicyByIdResponse> copyPolicyById =
        genForCopyPolicyById();

    private static HttpRequestDef<CopyPolicyByIdRequest, CopyPolicyByIdResponse> genForCopyPolicyById() {
        // basic
        HttpRequestDef.Builder<CopyPolicyByIdRequest, CopyPolicyByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyPolicyByIdRequest.class, CopyPolicyByIdResponse.class)
                .withName("CopyPolicyById")
                .withUri("/v1/{project_id}/waf/policies/{src_policy_id}/copy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("src_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPolicyByIdRequest::getSrcPolicyId, CopyPolicyByIdRequest::setSrcPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPolicyByIdRequest::getEnterpriseProjectId,
                CopyPolicyByIdRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("dest_policy_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPolicyByIdRequest::getDestPolicyName, CopyPolicyByIdRequest::setDestPolicyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertNoticeConfigRequest, CreateAlertNoticeConfigResponse> createAlertNoticeConfig =
        genForCreateAlertNoticeConfig();

    private static HttpRequestDef<CreateAlertNoticeConfigRequest, CreateAlertNoticeConfigResponse> genForCreateAlertNoticeConfig() {
        // basic
        HttpRequestDef.Builder<CreateAlertNoticeConfigRequest, CreateAlertNoticeConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAlertNoticeConfigRequest.class, CreateAlertNoticeConfigResponse.class)
            .withName("CreateAlertNoticeConfig")
            .withUri("/v2/{project_id}/waf/alert")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterpriseProjectId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertNoticeConfigRequest::getEnterpriseProjectId,
                CreateAlertNoticeConfigRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertNoticeConfigRequest::getXLanguage,
                CreateAlertNoticeConfigRequest::setXLanguage));
        builder.<AlertNoticeConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlertNoticeConfig.class),
            f -> f.withMarshaller(CreateAlertNoticeConfigRequest::getBody, CreateAlertNoticeConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRule =
        genForCreateAntiTamperRule();

    private static HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> genForCreateAntiTamperRule() {
        // basic
        HttpRequestDef.Builder<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntiTamperRuleRequest.class, CreateAntiTamperRuleResponse.class)
            .withName("CreateAntiTamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getPolicyId, CreateAntiTamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getEnterpriseProjectId,
                CreateAntiTamperRuleRequest::setEnterpriseProjectId));
        builder.<CreateAntiTamperRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntiTamperRulesRequestBody.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getBody, CreateAntiTamperRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> createAnticrawlerRule =
        genForCreateAnticrawlerRule();

    private static HttpRequestDef<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> genForCreateAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAnticrawlerRuleRequest.class, CreateAnticrawlerRuleResponse.class)
            .withName("CreateAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getPolicyId,
                CreateAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getEnterpriseProjectId,
                CreateAnticrawlerRuleRequest::setEnterpriseProjectId));
        builder.<CreateAnticrawlerRuleRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAnticrawlerRuleRequestbody.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getBody, CreateAnticrawlerRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> createAntileakageRule =
        genForCreateAntileakageRule();

    private static HttpRequestDef<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> genForCreateAntileakageRule() {
        // basic
        HttpRequestDef.Builder<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntileakageRuleRequest.class, CreateAntileakageRuleResponse.class)
            .withName("CreateAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getPolicyId,
                CreateAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getEnterpriseProjectId,
                CreateAntileakageRuleRequest::setEnterpriseProjectId));
        builder.<CreateAntileakageRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntileakageRuleRequestBody.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getBody, CreateAntileakageRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCcRuleRequest, CreateCcRuleResponse> createCcRule = genForCreateCcRule();

    private static HttpRequestDef<CreateCcRuleRequest, CreateCcRuleResponse> genForCreateCcRule() {
        // basic
        HttpRequestDef.Builder<CreateCcRuleRequest, CreateCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCcRuleRequest.class, CreateCcRuleResponse.class)
                .withName("CreateCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getPolicyId, CreateCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getEnterpriseProjectId,
                CreateCcRuleRequest::setEnterpriseProjectId));
        builder.<CreateCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCcRuleRequestBody.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getBody, CreateCcRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForCreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForCreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getEnterpriseProjectId,
                CreateCertificateRequest::setEnterpriseProjectId));
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, CreateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> createCloudWafPostPaidResource =
        genForCreateCloudWafPostPaidResource();

    private static HttpRequestDef<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> genForCreateCloudWafPostPaidResource() {
        // basic
        HttpRequestDef.Builder<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCloudWafPostPaidResourceRequest.class,
                    CreateCloudWafPostPaidResourceResponse.class)
                .withName("CreateCloudWafPostPaidResource")
                .withUri("/v1/{project_id}/waf/postpaid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getEnterpriseProjectId,
                CreateCloudWafPostPaidResourceRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getRegion,
                CreateCloudWafPostPaidResourceRequest::setRegion));
        builder.<CreateCloudWafPostPaidResourceRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudWafPostPaidResourceRequestbody.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getBody,
                CreateCloudWafPostPaidResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomRuleRequest, CreateCustomRuleResponse> createCustomRule =
        genForCreateCustomRule();

    private static HttpRequestDef<CreateCustomRuleRequest, CreateCustomRuleResponse> genForCreateCustomRule() {
        // basic
        HttpRequestDef.Builder<CreateCustomRuleRequest, CreateCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomRuleRequest.class, CreateCustomRuleResponse.class)
                .withName("CreateCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getPolicyId, CreateCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getEnterpriseProjectId,
                CreateCustomRuleRequest::setEnterpriseProjectId));
        builder.<CreateCustomRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomRuleRequestBody.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getBody, CreateCustomRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventExportJobRequest, CreateEventExportJobResponse> createEventExportJob =
        genForCreateEventExportJob();

    private static HttpRequestDef<CreateEventExportJobRequest, CreateEventExportJobResponse> genForCreateEventExportJob() {
        // basic
        HttpRequestDef.Builder<CreateEventExportJobRequest, CreateEventExportJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEventExportJobRequest.class, CreateEventExportJobResponse.class)
            .withName("CreateEventExportJob")
            .withUri("/v1/{project_id}/waf/event/job/export")
            .withContentType("application/json");

        // requests
        builder.<AsyncJobReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AsyncJobReqBody.class),
            f -> f.withMarshaller(CreateEventExportJobRequest::getBody, CreateEventExportJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRule =
        genForCreateGeoipRule();

    private static HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> genForCreateGeoipRule() {
        // basic
        HttpRequestDef.Builder<CreateGeoipRuleRequest, CreateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGeoipRuleRequest.class, CreateGeoipRuleResponse.class)
                .withName("CreateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getPolicyId, CreateGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getEnterpriseProjectId,
                CreateGeoipRuleRequest::setEnterpriseProjectId));
        builder.<CreateGeoIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGeoIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getBody, CreateGeoipRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostRequest, CreateHostResponse> createHost = genForCreateHost();

    private static HttpRequestDef<CreateHostRequest, CreateHostResponse> genForCreateHost() {
        // basic
        HttpRequestDef.Builder<CreateHostRequest, CreateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostRequest.class, CreateHostResponse.class)
                .withName("CreateHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHostRequest::getEnterpriseProjectId,
                CreateHostRequest::setEnterpriseProjectId));
        builder.<CreateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostRequestBody.class),
            f -> f.withMarshaller(CreateHostRequest::getBody, CreateHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRule =
        genForCreateIgnoreRule();

    private static HttpRequestDef<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> genForCreateIgnoreRule() {
        // basic
        HttpRequestDef.Builder<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIgnoreRuleRequest.class, CreateIgnoreRuleResponse.class)
                .withName("CreateIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getPolicyId, CreateIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getEnterpriseProjectId,
                CreateIgnoreRuleRequest::setEnterpriseProjectId));
        builder.<CreateIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getBody, CreateIgnoreRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/{project_id}/premium-waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getEnterpriseProjectId,
                CreateInstanceRequest::setEnterpriseProjectId));
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroup =
        genForCreateIpGroup();

    private static HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> genForCreateIpGroup() {
        // basic
        HttpRequestDef.Builder<CreateIpGroupRequest, CreateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIpGroupRequest.class, CreateIpGroupResponse.class)
                .withName("CreateIpGroup")
                .withUri("/v1/{project_id}/waf/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIpGroupRequest::getEnterpriseProjectId,
                CreateIpGroupRequest::setEnterpriseProjectId));
        builder.<CreateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIpGroupRequestBody.class),
            f -> f.withMarshaller(CreateIpGroupRequest::getBody, CreateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpReputationRuleRequest, CreateIpReputationRuleResponse> createIpReputationRule =
        genForCreateIpReputationRule();

    private static HttpRequestDef<CreateIpReputationRuleRequest, CreateIpReputationRuleResponse> genForCreateIpReputationRule() {
        // basic
        HttpRequestDef.Builder<CreateIpReputationRuleRequest, CreateIpReputationRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIpReputationRuleRequest.class, CreateIpReputationRuleResponse.class)
            .withName("CreateIpReputationRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/ip-reputation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIpReputationRuleRequest::getPolicyId,
                CreateIpReputationRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIpReputationRuleRequest::getEnterpriseProjectId,
                CreateIpReputationRuleRequest::setEnterpriseProjectId));
        builder.<CreateIpReputationRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIpReputationRuleRequestBody.class),
            f -> f.withMarshaller(CreateIpReputationRuleRequest::getBody, CreateIpReputationRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getEnterpriseProjectId,
                CreatePolicyRequest::setEnterpriseProjectId));
        builder.<CreatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHost =
        genForCreatePremiumHost();

    private static HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> genForCreatePremiumHost() {
        // basic
        HttpRequestDef.Builder<CreatePremiumHostRequest, CreatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePremiumHostRequest.class, CreatePremiumHostResponse.class)
                .withName("CreatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePremiumHostRequest::getEnterpriseProjectId,
                CreatePremiumHostRequest::setEnterpriseProjectId));
        builder.<CreatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePremiumHostRequestBody.class),
            f -> f.withMarshaller(CreatePremiumHostRequest::getBody, CreatePremiumHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> createPrepaidCloudWaf =
        genForCreatePrepaidCloudWaf();

    private static HttpRequestDef<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> genForCreatePrepaidCloudWaf() {
        // basic
        HttpRequestDef.Builder<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePrepaidCloudWafRequest.class, CreatePrepaidCloudWafResponse.class)
            .withName("CreatePrepaidCloudWaf")
            .withUri("/v1/{project_id}/waf/subscription/purchase/prepaid-cloud-waf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrepaidCloudWafRequest::getEnterpriseProjectId,
                CreatePrepaidCloudWafRequest::setEnterpriseProjectId));
        builder.<CreatePrepaidCloudWafRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrepaidCloudWafRequestBody.class),
            f -> f.withMarshaller(CreatePrepaidCloudWafRequest::getBody, CreatePrepaidCloudWafRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRule =
        genForCreatePrivacyRule();

    private static HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> genForCreatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivacyRuleRequest.class, CreatePrivacyRuleResponse.class)
                .withName("CreatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getPolicyId, CreatePrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getEnterpriseProjectId,
                CreatePrivacyRuleRequest::setEnterpriseProjectId));
        builder.<CreatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getBody, CreatePrivacyRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> createPunishmentRule =
        genForCreatePunishmentRule();

    private static HttpRequestDef<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> genForCreatePunishmentRule() {
        // basic
        HttpRequestDef.Builder<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePunishmentRuleRequest.class, CreatePunishmentRuleResponse.class)
            .withName("CreatePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getPolicyId, CreatePunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getEnterpriseProjectId,
                CreatePunishmentRuleRequest::setEnterpriseProjectId));
        builder.<CreatePunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePunishmentRuleRequestBody.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getBody, CreatePunishmentRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateValueListRequest, CreateValueListResponse> createValueList =
        genForCreateValueList();

    private static HttpRequestDef<CreateValueListRequest, CreateValueListResponse> genForCreateValueList() {
        // basic
        HttpRequestDef.Builder<CreateValueListRequest, CreateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateValueListRequest.class, CreateValueListResponse.class)
                .withName("CreateValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateValueListRequest::getEnterpriseProjectId,
                CreateValueListRequest::setEnterpriseProjectId));
        builder.<CreateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateValueListRequestBody.class),
            f -> f.withMarshaller(CreateValueListRequest::getBody, CreateValueListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRule =
        genForCreateWhiteblackipRule();

    private static HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> genForCreateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWhiteblackipRuleRequest.class, CreateWhiteblackipRuleResponse.class)
            .withName("CreateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getPolicyId,
                CreateWhiteblackipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getEnterpriseProjectId,
                CreateWhiteblackipRuleRequest::setEnterpriseProjectId));
        builder.<CreateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getBody, CreateWhiteblackipRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRule =
        genForDeleteAnticrawlerRule();

    private static HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> genForDeleteAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAnticrawlerRuleRequest.class, DeleteAnticrawlerRuleResponse.class)
            .withName("DeleteAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getPolicyId,
                DeleteAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getRuleId, DeleteAnticrawlerRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getEnterpriseProjectId,
                DeleteAnticrawlerRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRule =
        genForDeleteAntileakageRule();

    private static HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> genForDeleteAntileakageRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAntileakageRuleRequest.class, DeleteAntileakageRuleResponse.class)
            .withName("DeleteAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getPolicyId,
                DeleteAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getRuleId, DeleteAntileakageRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getEnterpriseProjectId,
                DeleteAntileakageRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRule =
        genForDeleteAntitamperRule();

    private static HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> genForDeleteAntitamperRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAntitamperRuleRequest.class, DeleteAntitamperRuleResponse.class)
            .withName("DeleteAntitamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getPolicyId, DeleteAntitamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getRuleId, DeleteAntitamperRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getEnterpriseProjectId,
                DeleteAntitamperRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCcRuleRequest, DeleteCcRuleResponse> deleteCcRule = genForDeleteCcRule();

    private static HttpRequestDef<DeleteCcRuleRequest, DeleteCcRuleResponse> genForDeleteCcRule() {
        // basic
        HttpRequestDef.Builder<DeleteCcRuleRequest, DeleteCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCcRuleRequest.class, DeleteCcRuleResponse.class)
                .withName("DeleteCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getPolicyId, DeleteCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getRuleId, DeleteCcRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getEnterpriseProjectId,
                DeleteCcRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genForDeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genForDeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getEnterpriseProjectId,
                DeleteCertificateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> deleteCloudWafPostPaidResource =
        genForDeleteCloudWafPostPaidResource();

    private static HttpRequestDef<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> genForDeleteCloudWafPostPaidResource() {
        // basic
        HttpRequestDef.Builder<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCloudWafPostPaidResourceRequest.class,
                    DeleteCloudWafPostPaidResourceResponse.class)
                .withName("DeleteCloudWafPostPaidResource")
                .withUri("/v1/{project_id}/waf/postpaid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudWafPostPaidResourceRequest::getEnterpriseProjectId,
                DeleteCloudWafPostPaidResourceRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudWafPostPaidResourceRequest::getRegion,
                DeleteCloudWafPostPaidResourceRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRule =
        genForDeleteCustomRule();

    private static HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> genForDeleteCustomRule() {
        // basic
        HttpRequestDef.Builder<DeleteCustomRuleRequest, DeleteCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomRuleRequest.class, DeleteCustomRuleResponse.class)
                .withName("DeleteCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getPolicyId, DeleteCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getRuleId, DeleteCustomRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getEnterpriseProjectId,
                DeleteCustomRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRule =
        genForDeleteGeoipRule();

    private static HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> genForDeleteGeoipRule() {
        // basic
        HttpRequestDef.Builder<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGeoipRuleRequest.class, DeleteGeoipRuleResponse.class)
                .withName("DeleteGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getPolicyId, DeleteGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getRuleId, DeleteGeoipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getEnterpriseProjectId,
                DeleteGeoipRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostRequest, DeleteHostResponse> deleteHost = genForDeleteHost();

    private static HttpRequestDef<DeleteHostRequest, DeleteHostResponse> genForDeleteHost() {
        // basic
        HttpRequestDef.Builder<DeleteHostRequest, DeleteHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostRequest.class, DeleteHostResponse.class)
                .withName("DeleteHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getInstanceId, DeleteHostRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getEnterpriseProjectId,
                DeleteHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRule =
        genForDeleteIgnoreRule();

    private static HttpRequestDef<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> genForDeleteIgnoreRule() {
        // basic
        HttpRequestDef.Builder<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIgnoreRuleRequest.class, DeleteIgnoreRuleResponse.class)
                .withName("DeleteIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getPolicyId, DeleteIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getRuleId, DeleteIgnoreRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getEnterpriseProjectId,
                DeleteIgnoreRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getEnterpriseProjectId,
                DeleteInstanceRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup =
        genForDeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genForDeleteIpGroup() {
        // basic
        HttpRequestDef.Builder<DeleteIpGroupRequest, DeleteIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIpGroupRequest.class, DeleteIpGroupResponse.class)
                .withName("DeleteIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getId, DeleteIpGroupRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getEnterpriseProjectId,
                DeleteIpGroupRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpReputationRuleRequest, DeleteIpReputationRuleResponse> deleteIpReputationRule =
        genForDeleteIpReputationRule();

    private static HttpRequestDef<DeleteIpReputationRuleRequest, DeleteIpReputationRuleResponse> genForDeleteIpReputationRule() {
        // basic
        HttpRequestDef.Builder<DeleteIpReputationRuleRequest, DeleteIpReputationRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteIpReputationRuleRequest.class, DeleteIpReputationRuleResponse.class)
            .withName("DeleteIpReputationRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/ip-reputation/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpReputationRuleRequest::getPolicyId,
                DeleteIpReputationRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpReputationRuleRequest::getRuleId, DeleteIpReputationRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpReputationRuleRequest::getEnterpriseProjectId,
                DeleteIpReputationRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getEnterpriseProjectId,
                DeletePolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHost =
        genForDeletePremiumHost();

    private static HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> genForDeletePremiumHost() {
        // basic
        HttpRequestDef.Builder<DeletePremiumHostRequest, DeletePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePremiumHostRequest.class, DeletePremiumHostResponse.class)
                .withName("DeletePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getHostId, DeletePremiumHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getEnterpriseProjectId,
                DeletePremiumHostRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("keepPolicy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getKeepPolicy, DeletePremiumHostRequest::setKeepPolicy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRule =
        genForDeletePrivacyRule();

    private static HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> genForDeletePrivacyRule() {
        // basic
        HttpRequestDef.Builder<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivacyRuleRequest.class, DeletePrivacyRuleResponse.class)
                .withName("DeletePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getPolicyId, DeletePrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getRuleId, DeletePrivacyRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getEnterpriseProjectId,
                DeletePrivacyRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> deletePunishmentRule =
        genForDeletePunishmentRule();

    private static HttpRequestDef<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> genForDeletePunishmentRule() {
        // basic
        HttpRequestDef.Builder<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePunishmentRuleRequest.class, DeletePunishmentRuleResponse.class)
            .withName("DeletePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getPolicyId, DeletePunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getRuleId, DeletePunishmentRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getEnterpriseProjectId,
                DeletePunishmentRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> deleteValueList =
        genForDeleteValueList();

    private static HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> genForDeleteValueList() {
        // basic
        HttpRequestDef.Builder<DeleteValueListRequest, DeleteValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteValueListRequest.class, DeleteValueListResponse.class)
                .withName("DeleteValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteValueListRequest::getValuelistid, DeleteValueListRequest::setValuelistid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteValueListRequest::getEnterpriseProjectId,
                DeleteValueListRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRule =
        genForDeleteWhiteBlackIpRule();

    private static HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> genForDeleteWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWhiteBlackIpRuleRequest.class, DeleteWhiteBlackIpRuleResponse.class)
            .withName("DeleteWhiteBlackIpRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getPolicyId,
                DeleteWhiteBlackIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getRuleId, DeleteWhiteBlackIpRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getEnterpriseProjectId,
                DeleteWhiteBlackIpRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntiTamperPolicyRulesRequest, ListAntiTamperPolicyRulesResponse> listAntiTamperPolicyRules =
        genForListAntiTamperPolicyRules();

    private static HttpRequestDef<ListAntiTamperPolicyRulesRequest, ListAntiTamperPolicyRulesResponse> genForListAntiTamperPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListAntiTamperPolicyRulesRequest, ListAntiTamperPolicyRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAntiTamperPolicyRulesRequest.class,
                    ListAntiTamperPolicyRulesResponse.class)
                .withName("ListAntiTamperPolicyRules")
                .withUri("/v1/{projectid}/waf/rule/antitamper")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiTamperPolicyRulesRequest::getProjectid,
                ListAntiTamperPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiTamperPolicyRulesRequest::getPolicyids,
                ListAntiTamperPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiTamperPolicyRulesRequest::getEnterpriseProjectId,
                ListAntiTamperPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiTamperPolicyRulesRequest::getPage,
                ListAntiTamperPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiTamperPolicyRulesRequest::getPagesize,
                ListAntiTamperPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRules =
        genForListAnticrawlerRules();

    private static HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> genForListAnticrawlerRules() {
        // basic
        HttpRequestDef.Builder<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAnticrawlerRulesRequest.class, ListAnticrawlerRulesResponse.class)
            .withName("ListAnticrawlerRules")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getPolicyId, ListAnticrawlerRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getEnterpriseProjectId,
                ListAnticrawlerRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getOffset, ListAnticrawlerRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getLimit, ListAnticrawlerRulesRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getType, ListAnticrawlerRulesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntileakagePolicyRulesRequest, ListAntileakagePolicyRulesResponse> listAntileakagePolicyRules =
        genForListAntileakagePolicyRules();

    private static HttpRequestDef<ListAntileakagePolicyRulesRequest, ListAntileakagePolicyRulesResponse> genForListAntileakagePolicyRules() {
        // basic
        HttpRequestDef.Builder<ListAntileakagePolicyRulesRequest, ListAntileakagePolicyRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAntileakagePolicyRulesRequest.class,
                    ListAntileakagePolicyRulesResponse.class)
                .withName("ListAntileakagePolicyRules")
                .withUri("/v1/{projectid}/waf/rule/antileakage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakagePolicyRulesRequest::getProjectid,
                ListAntileakagePolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakagePolicyRulesRequest::getPolicyids,
                ListAntileakagePolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakagePolicyRulesRequest::getEnterpriseProjectId,
                ListAntileakagePolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakagePolicyRulesRequest::getPage,
                ListAntileakagePolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakagePolicyRulesRequest::getPagesize,
                ListAntileakagePolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRules =
        genForListAntileakageRules();

    private static HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> genForListAntileakageRules() {
        // basic
        HttpRequestDef.Builder<ListAntileakageRulesRequest, ListAntileakageRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAntileakageRulesRequest.class, ListAntileakageRulesResponse.class)
            .withName("ListAntileakageRules")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getPolicyId, ListAntileakageRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getEnterpriseProjectId,
                ListAntileakageRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getOffset, ListAntileakageRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getLimit, ListAntileakageRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRule =
        genForListAntitamperRule();

    private static HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> genForListAntitamperRule() {
        // basic
        HttpRequestDef.Builder<ListAntitamperRuleRequest, ListAntitamperRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntitamperRuleRequest.class, ListAntitamperRuleResponse.class)
                .withName("ListAntitamperRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPolicyId, ListAntitamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getEnterpriseProjectId,
                ListAntitamperRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPage, ListAntitamperRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPagesize, ListAntitamperRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttackActionTypesRequest, ListAttackActionTypesResponse> listAttackActionTypes =
        genForListAttackActionTypes();

    private static HttpRequestDef<ListAttackActionTypesRequest, ListAttackActionTypesResponse> genForListAttackActionTypes() {
        // basic
        HttpRequestDef.Builder<ListAttackActionTypesRequest, ListAttackActionTypesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAttackActionTypesRequest.class, ListAttackActionTypesResponse.class)
            .withName("ListAttackActionTypes")
            .withUri("/v1/{project_id}/waf/overviews/attack/action-types")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackActionTypesRequest::getEnterpriseProjectId,
                ListAttackActionTypesRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackActionTypesRequest::getFrom, ListAttackActionTypesRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackActionTypesRequest::getTo, ListAttackActionTypesRequest::setTo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimeline =
        genForListBandwidthTimeline();

    private static HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> genForListBandwidthTimeline() {
        // basic
        HttpRequestDef.Builder<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBandwidthTimelineRequest.class, ListBandwidthTimelineResponse.class)
            .withName("ListBandwidthTimeline")
            .withUri("/v1/{project_id}/waf/overviews/bandwidth/timeline")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getEnterpriseProjectId,
                ListBandwidthTimelineRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getFrom, ListBandwidthTimelineRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getTo, ListBandwidthTimelineRequest::setTo));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getHosts, ListBandwidthTimelineRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getInstances,
                ListBandwidthTimelineRequest::setInstances));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getGroupBy, ListBandwidthTimelineRequest::setGroupBy));
        builder.<Integer>withRequestField("display_option",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getDisplayOption,
                ListBandwidthTimelineRequest::setDisplayOption));

        // response
        builder.<List<BandwidthStatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthTimelineResponse::getBody, ListBandwidthTimelineResponse::setBody)
                .withInnerContainerType(BandwidthStatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListBotMRequestDistributionRequest, ListBotMRequestDistributionResponse> listBotMRequestDistribution =
        genForListBotMRequestDistribution();

    private static HttpRequestDef<ListBotMRequestDistributionRequest, ListBotMRequestDistributionResponse> genForListBotMRequestDistribution() {
        // basic
        HttpRequestDef.Builder<ListBotMRequestDistributionRequest, ListBotMRequestDistributionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBotMRequestDistributionRequest.class,
                    ListBotMRequestDistributionResponse.class)
                .withName("ListBotMRequestDistribution")
                .withUri("/v1/{project_id}/waf/overviews/bot-manager/bot-request-distribution")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getStartTime,
                ListBotMRequestDistributionRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getEndTime,
                ListBotMRequestDistributionRequest::setEndTime));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getTenantId,
                ListBotMRequestDistributionRequest::setTenantId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getEnterpriseProjectId,
                ListBotMRequestDistributionRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getHosts,
                ListBotMRequestDistributionRequest::setHosts));
        builder.<List<String>>withRequestField("domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getDomains,
                ListBotMRequestDistributionRequest::setDomains));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getRegion,
                ListBotMRequestDistributionRequest::setRegion));
        builder.<String>withRequestField("site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMRequestDistributionRequest::getSite,
                ListBotMRequestDistributionRequest::setSite));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBotMRulesRequest, ListBotMRulesResponse> listBotMRules =
        genForListBotMRules();

    private static HttpRequestDef<ListBotMRulesRequest, ListBotMRulesResponse> genForListBotMRules() {
        // basic
        HttpRequestDef.Builder<ListBotMRulesRequest, ListBotMRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBotMRulesRequest.class, ListBotMRulesResponse.class)
                .withName("ListBotMRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/bot-manager")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMRulesRequest::getPolicyId, ListBotMRulesRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBotMScoreDistributionRequest, ListBotMScoreDistributionResponse> listBotMScoreDistribution =
        genForListBotMScoreDistribution();

    private static HttpRequestDef<ListBotMScoreDistributionRequest, ListBotMScoreDistributionResponse> genForListBotMScoreDistribution() {
        // basic
        HttpRequestDef.Builder<ListBotMScoreDistributionRequest, ListBotMScoreDistributionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBotMScoreDistributionRequest.class,
                    ListBotMScoreDistributionResponse.class)
                .withName("ListBotMScoreDistribution")
                .withUri("/v1/{project_id}/waf/overviews/bot-manager/bot-score-distribution")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getStartTime,
                ListBotMScoreDistributionRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getEndTime,
                ListBotMScoreDistributionRequest::setEndTime));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getTenantId,
                ListBotMScoreDistributionRequest::setTenantId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getEnterpriseProjectId,
                ListBotMScoreDistributionRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getHosts,
                ListBotMScoreDistributionRequest::setHosts));
        builder.<List<String>>withRequestField("domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getDomains,
                ListBotMScoreDistributionRequest::setDomains));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getRegion,
                ListBotMScoreDistributionRequest::setRegion));
        builder.<String>withRequestField("site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMScoreDistributionRequest::getSite,
                ListBotMScoreDistributionRequest::setSite));

        // response
        builder.<List<TypedStatBucket>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListBotMScoreDistributionResponse::getBody, ListBotMScoreDistributionResponse::setBody)
                .withInnerContainerType(TypedStatBucket.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListBotMTimelineRequest, ListBotMTimelineResponse> listBotMTimeline =
        genForListBotMTimeline();

    private static HttpRequestDef<ListBotMTimelineRequest, ListBotMTimelineResponse> genForListBotMTimeline() {
        // basic
        HttpRequestDef.Builder<ListBotMTimelineRequest, ListBotMTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBotMTimelineRequest.class, ListBotMTimelineResponse.class)
                .withName("ListBotMTimeline")
                .withUri("/v1/{project_id}/waf/overviews/bot-manager/bot-request-on-timeline")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getStartTime, ListBotMTimelineRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getEndTime, ListBotMTimelineRequest::setEndTime));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getTenantId, ListBotMTimelineRequest::setTenantId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getEnterpriseProjectId,
                ListBotMTimelineRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getHosts, ListBotMTimelineRequest::setHosts));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getDomain, ListBotMTimelineRequest::setDomain));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getRegion, ListBotMTimelineRequest::setRegion));
        builder.<String>withRequestField("site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTimelineRequest::getSite, ListBotMTimelineRequest::setSite));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBotMTopnRequestRequest, ListBotMTopnRequestResponse> listBotMTopnRequest =
        genForListBotMTopnRequest();

    private static HttpRequestDef<ListBotMTopnRequestRequest, ListBotMTopnRequestResponse> genForListBotMTopnRequest() {
        // basic
        HttpRequestDef.Builder<ListBotMTopnRequestRequest, ListBotMTopnRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBotMTopnRequestRequest.class, ListBotMTopnRequestResponse.class)
                .withName("ListBotMTopnRequest")
                .withUri("/v1/{project_id}/waf/overviews/bot-manager/topn-bot-request")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getStartTime, ListBotMTopnRequestRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getEndTime, ListBotMTopnRequestRequest::setEndTime));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getTenantId, ListBotMTopnRequestRequest::setTenantId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getEnterpriseProjectId,
                ListBotMTopnRequestRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getHosts, ListBotMTopnRequestRequest::setHosts));
        builder.<Long>withRequestField("topn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getTopn, ListBotMTopnRequestRequest::setTopn));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getRegion, ListBotMTopnRequestRequest::setRegion));
        builder.<String>withRequestField("site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBotMTopnRequestRequest::getSite, ListBotMTopnRequestRequest::setSite));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCcPolicyRulesRequest, ListCcPolicyRulesResponse> listCcPolicyRules =
        genForListCcPolicyRules();

    private static HttpRequestDef<ListCcPolicyRulesRequest, ListCcPolicyRulesResponse> genForListCcPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListCcPolicyRulesRequest, ListCcPolicyRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCcPolicyRulesRequest.class, ListCcPolicyRulesResponse.class)
                .withName("ListCcPolicyRules")
                .withUri("/v1/{projectid}/waf/rule/cc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcPolicyRulesRequest::getProjectid, ListCcPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcPolicyRulesRequest::getPolicyids, ListCcPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcPolicyRulesRequest::getEnterpriseProjectId,
                ListCcPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcPolicyRulesRequest::getPage, ListCcPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcPolicyRulesRequest::getPagesize, ListCcPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCcRulesRequest, ListCcRulesResponse> listCcRules = genForListCcRules();

    private static HttpRequestDef<ListCcRulesRequest, ListCcRulesResponse> genForListCcRules() {
        // basic
        HttpRequestDef.Builder<ListCcRulesRequest, ListCcRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCcRulesRequest.class, ListCcRulesResponse.class)
                .withName("ListCcRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcRulesRequest::getPolicyId, ListCcRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcRulesRequest::getEnterpriseProjectId,
                ListCcRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcRulesRequest::getOffset, ListCcRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcRulesRequest::getLimit, ListCcRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForListCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForListCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getEnterpriseProjectId,
                ListCertificatesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPage, ListCertificatesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPagesize, ListCertificatesRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, ListCertificatesRequest::setName));
        builder.<Boolean>withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getHost, ListCertificatesRequest::setHost));
        builder.<Integer>withRequestField("exp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getExpStatus, ListCertificatesRequest::setExpStatus));
        builder.<Boolean>withRequestField("query_scm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getQueryScm, ListCertificatesRequest::setQueryScm));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHosts =
        genForListCompositeHosts();

    private static HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> genForListCompositeHosts() {
        // basic
        HttpRequestDef.Builder<ListCompositeHostsRequest, ListCompositeHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCompositeHostsRequest.class, ListCompositeHostsResponse.class)
                .withName("ListCompositeHosts")
                .withUri("/v1/{project_id}/composite-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getEnterpriseProjectId,
                ListCompositeHostsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPage, ListCompositeHostsRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPagesize, ListCompositeHostsRequest::setPagesize));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getHostname, ListCompositeHostsRequest::setHostname));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPolicyname, ListCompositeHostsRequest::setPolicyname));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getProtectStatus,
                ListCompositeHostsRequest::setProtectStatus));
        builder.<String>withRequestField("waf_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getWafType, ListCompositeHostsRequest::setWafType));
        builder.<Boolean>withRequestField("is_https",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getIsHttps, ListCompositeHostsRequest::setIsHttps));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomPolicyRulesRequest, ListCustomPolicyRulesResponse> listCustomPolicyRules =
        genForListCustomPolicyRules();

    private static HttpRequestDef<ListCustomPolicyRulesRequest, ListCustomPolicyRulesResponse> genForListCustomPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListCustomPolicyRulesRequest, ListCustomPolicyRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCustomPolicyRulesRequest.class, ListCustomPolicyRulesResponse.class)
            .withName("ListCustomPolicyRules")
            .withUri("/v1/{projectid}/waf/rule/custom")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomPolicyRulesRequest::getProjectid,
                ListCustomPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomPolicyRulesRequest::getPolicyids,
                ListCustomPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomPolicyRulesRequest::getEnterpriseProjectId,
                ListCustomPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomPolicyRulesRequest::getPage, ListCustomPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomPolicyRulesRequest::getPagesize,
                ListCustomPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRules =
        genForListCustomRules();

    private static HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> genForListCustomRules() {
        // basic
        HttpRequestDef.Builder<ListCustomRulesRequest, ListCustomRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomRulesRequest.class, ListCustomRulesResponse.class)
                .withName("ListCustomRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getPolicyId, ListCustomRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getEnterpriseProjectId,
                ListCustomRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getOffset, ListCustomRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getLimit, ListCustomRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventRequest, ListEventResponse> listEvent = genForListEvent();

    private static HttpRequestDef<ListEventRequest, ListEventResponse> genForListEvent() {
        // basic
        HttpRequestDef.Builder<ListEventRequest, ListEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventRequest.class, ListEventResponse.class)
                .withName("ListEvent")
                .withUri("/v1/{project_id}/waf/event")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventRequest::getEnterpriseProjectId, ListEventRequest::setEnterpriseProjectId));
        builder.<ListEventRequest.RecentEnum>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventRequest.RecentEnum.class),
            f -> f.withMarshaller(ListEventRequest::getRecent, ListEventRequest::setRecent));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventRequest::getFrom, ListEventRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventRequest::getTo, ListEventRequest::setTo));
        builder.<List<String>>withRequestField("attacks",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getAttacks, ListEventRequest::setAttacks));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getHosts, ListEventRequest::setHosts));
        builder.<List<String>>withRequestField("sips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getSips, ListEventRequest::setSips));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPage, ListEventRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPagesize, ListEventRequest::setPagesize));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventRequest::getXLanguage, ListEventRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGeoIpPolicyRulesRequest, ListGeoIpPolicyRulesResponse> listGeoIpPolicyRules =
        genForListGeoIpPolicyRules();

    private static HttpRequestDef<ListGeoIpPolicyRulesRequest, ListGeoIpPolicyRulesResponse> genForListGeoIpPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListGeoIpPolicyRulesRequest, ListGeoIpPolicyRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGeoIpPolicyRulesRequest.class, ListGeoIpPolicyRulesResponse.class)
            .withName("ListGeoIpPolicyRules")
            .withUri("/v1/{projectid}/waf/rule/geoip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoIpPolicyRulesRequest::getProjectid,
                ListGeoIpPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoIpPolicyRulesRequest::getPolicyids,
                ListGeoIpPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoIpPolicyRulesRequest::getEnterpriseProjectId,
                ListGeoIpPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoIpPolicyRulesRequest::getPage, ListGeoIpPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoIpPolicyRulesRequest::getPagesize, ListGeoIpPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRule =
        genForListGeoipRule();

    private static HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> genForListGeoipRule() {
        // basic
        HttpRequestDef.Builder<ListGeoipRuleRequest, ListGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGeoipRuleRequest.class, ListGeoipRuleResponse.class)
                .withName("ListGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPolicyId, ListGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getEnterpriseProjectId,
                ListGeoipRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPage, ListGeoipRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPagesize, ListGeoipRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRequest, ListHostResponse> listHost = genForListHost();

    private static HttpRequestDef<ListHostRequest, ListHostResponse> genForListHost() {
        // basic
        HttpRequestDef.Builder<ListHostRequest, ListHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRequest.class, ListHostResponse.class)
                .withName("ListHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getEnterpriseProjectId, ListHostRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPage, ListHostRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPagesize, ListHostRequest::setPagesize));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getHostname, ListHostRequest::setHostname));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getPolicyname, ListHostRequest::setPolicyname));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> listHostRoute =
        genForListHostRoute();

    private static HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> genForListHostRoute() {
        // basic
        HttpRequestDef.Builder<ListHostRouteRequest, ListHostRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRouteRequest.class, ListHostRouteResponse.class)
                .withName("ListHostRoute")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}/route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRouteRequest::getInstanceId, ListHostRouteRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRouteRequest::getEnterpriseProjectId,
                ListHostRouteRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIgnorePolicyRulesRequest, ListIgnorePolicyRulesResponse> listIgnorePolicyRules =
        genForListIgnorePolicyRules();

    private static HttpRequestDef<ListIgnorePolicyRulesRequest, ListIgnorePolicyRulesResponse> genForListIgnorePolicyRules() {
        // basic
        HttpRequestDef.Builder<ListIgnorePolicyRulesRequest, ListIgnorePolicyRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListIgnorePolicyRulesRequest.class, ListIgnorePolicyRulesResponse.class)
            .withName("ListIgnorePolicyRules")
            .withUri("/v1/{projectid}/waf/rule/ignore")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnorePolicyRulesRequest::getProjectid,
                ListIgnorePolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnorePolicyRulesRequest::getPolicyids,
                ListIgnorePolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnorePolicyRulesRequest::getEnterpriseProjectId,
                ListIgnorePolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnorePolicyRulesRequest::getPage, ListIgnorePolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnorePolicyRulesRequest::getPagesize,
                ListIgnorePolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRule =
        genForListIgnoreRule();

    private static HttpRequestDef<ListIgnoreRuleRequest, ListIgnoreRuleResponse> genForListIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ListIgnoreRuleRequest, ListIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIgnoreRuleRequest.class, ListIgnoreRuleResponse.class)
                .withName("ListIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPolicyId, ListIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getEnterpriseProjectId,
                ListIgnoreRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPage, ListIgnoreRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPagesize, ListIgnoreRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForListInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForListInstance() {
        // basic
        HttpRequestDef.Builder<ListInstanceRequest, ListInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceRequest.class, ListInstanceResponse.class)
                .withName("ListInstance")
                .withUri("/v1/{project_id}/premium-waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getEnterpriseProjectId,
                ListInstanceRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getPage, ListInstanceRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getPagesize, ListInstanceRequest::setPagesize));
        builder.<String>withRequestField("instancename",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getInstancename, ListInstanceRequest::setInstancename));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForListInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForListInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v1/{project_id}/waf/waf-instance/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getEnterpriseProjectId,
                ListInstanceTagsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupRequest, ListIpGroupResponse> listIpGroup = genForListIpGroup();

    private static HttpRequestDef<ListIpGroupRequest, ListIpGroupResponse> genForListIpGroup() {
        // basic
        HttpRequestDef.Builder<ListIpGroupRequest, ListIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpGroupRequest.class, ListIpGroupResponse.class)
                .withName("ListIpGroup")
                .withUri("/v1/{project_id}/waf/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getEnterpriseProjectId,
                ListIpGroupRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupRequest::getPage, ListIpGroupRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupRequest::getPagesize, ListIpGroupRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getName, ListIpGroupRequest::setName));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getIp, ListIpGroupRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpReputationPolicyRulesRequest, ListIpReputationPolicyRulesResponse> listIpReputationPolicyRules =
        genForListIpReputationPolicyRules();

    private static HttpRequestDef<ListIpReputationPolicyRulesRequest, ListIpReputationPolicyRulesResponse> genForListIpReputationPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListIpReputationPolicyRulesRequest, ListIpReputationPolicyRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListIpReputationPolicyRulesRequest.class,
                    ListIpReputationPolicyRulesResponse.class)
                .withName("ListIpReputationPolicyRules")
                .withUri("/v1/{projectid}/waf/rule/ip-reputation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpReputationPolicyRulesRequest::getProjectid,
                ListIpReputationPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpReputationPolicyRulesRequest::getPolicyids,
                ListIpReputationPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpReputationPolicyRulesRequest::getEnterpriseProjectId,
                ListIpReputationPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpReputationPolicyRulesRequest::getPage,
                ListIpReputationPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpReputationPolicyRulesRequest::getPagesize,
                ListIpReputationPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpReputationRulesRequest, ListIpReputationRulesResponse> listIpReputationRules =
        genForListIpReputationRules();

    private static HttpRequestDef<ListIpReputationRulesRequest, ListIpReputationRulesResponse> genForListIpReputationRules() {
        // basic
        HttpRequestDef.Builder<ListIpReputationRulesRequest, ListIpReputationRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListIpReputationRulesRequest.class, ListIpReputationRulesResponse.class)
            .withName("ListIpReputationRules")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/ip-reputation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpReputationRulesRequest::getPolicyId,
                ListIpReputationRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpReputationRulesRequest::getEnterpriseProjectId,
                ListIpReputationRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpReputationRulesRequest::getOffset, ListIpReputationRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpReputationRulesRequest::getLimit, ListIpReputationRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLlmGuardPolicyRulesRequest, ListLlmGuardPolicyRulesResponse> listLlmGuardPolicyRules =
        genForListLlmGuardPolicyRules();

    private static HttpRequestDef<ListLlmGuardPolicyRulesRequest, ListLlmGuardPolicyRulesResponse> genForListLlmGuardPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListLlmGuardPolicyRulesRequest, ListLlmGuardPolicyRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLlmGuardPolicyRulesRequest.class, ListLlmGuardPolicyRulesResponse.class)
            .withName("ListLlmGuardPolicyRules")
            .withUri("/v1/{projectid}/waf/rule/llm-guards")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLlmGuardPolicyRulesRequest::getProjectid,
                ListLlmGuardPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLlmGuardPolicyRulesRequest::getPolicyids,
                ListLlmGuardPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLlmGuardPolicyRulesRequest::getEnterpriseProjectId,
                ListLlmGuardPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLlmGuardPolicyRulesRequest::getPage, ListLlmGuardPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLlmGuardPolicyRulesRequest::getPagesize,
                ListLlmGuardPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeConfigsRequest, ListNoticeConfigsResponse> listNoticeConfigs =
        genForListNoticeConfigs();

    private static HttpRequestDef<ListNoticeConfigsRequest, ListNoticeConfigsResponse> genForListNoticeConfigs() {
        // basic
        HttpRequestDef.Builder<ListNoticeConfigsRequest, ListNoticeConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeConfigsRequest.class, ListNoticeConfigsResponse.class)
                .withName("ListNoticeConfigs")
                .withUri("/v2/{project_id}/waf/alerts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticeConfigsRequest::getEnterpriseProjectId,
                ListNoticeConfigsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassification =
        genForListOverviewsClassification();

    private static HttpRequestDef<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> genForListOverviewsClassification() {
        // basic
        HttpRequestDef.Builder<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOverviewsClassificationRequest.class,
                    ListOverviewsClassificationResponse.class)
                .withName("ListOverviewsClassification")
                .withUri("/v1/{project_id}/waf/overviews/classification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getEnterpriseProjectId,
                ListOverviewsClassificationRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getFrom,
                ListOverviewsClassificationRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getTo,
                ListOverviewsClassificationRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getTop,
                ListOverviewsClassificationRequest::setTop));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getHosts,
                ListOverviewsClassificationRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getInstances,
                ListOverviewsClassificationRequest::setInstances));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getXLanguage,
                ListOverviewsClassificationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForListPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForListPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getEnterpriseProjectId,
                ListPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPage, ListPolicyRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPagesize, ListPolicyRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getName, ListPolicyRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHost =
        genForListPremiumHost();

    private static HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> genForListPremiumHost() {
        // basic
        HttpRequestDef.Builder<ListPremiumHostRequest, ListPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPremiumHostRequest.class, ListPremiumHostResponse.class)
                .withName("ListPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getEnterpriseProjectId,
                ListPremiumHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPage, ListPremiumHostRequest::setPage));
        builder.<String>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPagesize, ListPremiumHostRequest::setPagesize));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getHostname, ListPremiumHostRequest::setHostname));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPolicyname, ListPremiumHostRequest::setPolicyname));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getProtectStatus, ListPremiumHostRequest::setProtectStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivacyPolicyRulesRequest, ListPrivacyPolicyRulesResponse> listPrivacyPolicyRules =
        genForListPrivacyPolicyRules();

    private static HttpRequestDef<ListPrivacyPolicyRulesRequest, ListPrivacyPolicyRulesResponse> genForListPrivacyPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListPrivacyPolicyRulesRequest, ListPrivacyPolicyRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPrivacyPolicyRulesRequest.class, ListPrivacyPolicyRulesResponse.class)
            .withName("ListPrivacyPolicyRules")
            .withUri("/v1/{projectid}/waf/rule/privacy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyPolicyRulesRequest::getProjectid,
                ListPrivacyPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyPolicyRulesRequest::getPolicyids,
                ListPrivacyPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyPolicyRulesRequest::getEnterpriseProjectId,
                ListPrivacyPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyPolicyRulesRequest::getPage, ListPrivacyPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyPolicyRulesRequest::getPagesize,
                ListPrivacyPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRule =
        genForListPrivacyRule();

    private static HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> genForListPrivacyRule() {
        // basic
        HttpRequestDef.Builder<ListPrivacyRuleRequest, ListPrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivacyRuleRequest.class, ListPrivacyRuleResponse.class)
                .withName("ListPrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPolicyId, ListPrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getEnterpriseProjectId,
                ListPrivacyRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPage, ListPrivacyRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPagesize, ListPrivacyRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectableResourcesRequest, ListProtectableResourcesResponse> listProtectableResources =
        genForListProtectableResources();

    private static HttpRequestDef<ListProtectableResourcesRequest, ListProtectableResourcesResponse> genForListProtectableResources() {
        // basic
        HttpRequestDef.Builder<ListProtectableResourcesRequest, ListProtectableResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListProtectableResourcesRequest.class, ListProtectableResourcesResponse.class)
                .withName("ListProtectableResources")
                .withUri("/v1/{project_id}/premium-waf/host/protectable-resources/{resource_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableResourcesRequest::getResourceType,
                ListProtectableResourcesRequest::setResourceType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableResourcesRequest::getVpcId,
                ListProtectableResourcesRequest::setVpcId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableResourcesRequest::getRegion,
                ListProtectableResourcesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPunishmentRulesRequest, ListPunishmentRulesResponse> listPunishmentRules =
        genForListPunishmentRules();

    private static HttpRequestDef<ListPunishmentRulesRequest, ListPunishmentRulesResponse> genForListPunishmentRules() {
        // basic
        HttpRequestDef.Builder<ListPunishmentRulesRequest, ListPunishmentRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPunishmentRulesRequest.class, ListPunishmentRulesResponse.class)
                .withName("ListPunishmentRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getPolicyId, ListPunishmentRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getEnterpriseProjectId,
                ListPunishmentRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getOffset, ListPunishmentRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getLimit, ListPunishmentRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimeline =
        genForListQpsTimeline();

    private static HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> genForListQpsTimeline() {
        // basic
        HttpRequestDef.Builder<ListQpsTimelineRequest, ListQpsTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQpsTimelineRequest.class, ListQpsTimelineResponse.class)
                .withName("ListQpsTimeline")
                .withUri("/v1/{project_id}/waf/overviews/qps/timeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getEnterpriseProjectId,
                ListQpsTimelineRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getFrom, ListQpsTimelineRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getTo, ListQpsTimelineRequest::setTo));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getHosts, ListQpsTimelineRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getInstances, ListQpsTimelineRequest::setInstances));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getGroupBy, ListQpsTimelineRequest::setGroupBy));

        // response
        builder.<List<StatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQpsTimelineResponse::getBody, ListQpsTimelineResponse::setBody)
                .withInnerContainerType(StatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimeline =
        genForListRequestTimeline();

    private static HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> genForListRequestTimeline() {
        // basic
        HttpRequestDef.Builder<ListRequestTimelineRequest, ListRequestTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestTimelineRequest.class, ListRequestTimelineResponse.class)
                .withName("ListRequestTimeline")
                .withUri("/v1/{project_id}/waf/overviews/request/timeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getEnterpriseProjectId,
                ListRequestTimelineRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getFrom, ListRequestTimelineRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getTo, ListRequestTimelineRequest::setTo));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getHosts, ListRequestTimelineRequest::setHosts));
        builder.<List<String>>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getInstances, ListRequestTimelineRequest::setInstances));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getGroupBy, ListRequestTimelineRequest::setGroupBy));

        // response
        builder.<List<StatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineResponse::getBody, ListRequestTimelineResponse::setBody)
                .withInnerContainerType(StatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> listResponseCodeTimeline =
        genForListResponseCodeTimeline();

    private static HttpRequestDef<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> genForListResponseCodeTimeline() {
        // basic
        HttpRequestDef.Builder<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListResponseCodeTimelineRequest.class, ListResponseCodeTimelineResponse.class)
                .withName("ListResponseCodeTimeline")
                .withUri("/v1/{project_id}/waf/overviews/response-code/timeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getEnterpriseProjectId,
                ListResponseCodeTimelineRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getFrom, ListResponseCodeTimelineRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getTo, ListResponseCodeTimelineRequest::setTo));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getHosts,
                ListResponseCodeTimelineRequest::setHosts));
        builder.<List<String>>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getInstances,
                ListResponseCodeTimelineRequest::setInstances));
        builder.<ListResponseCodeTimelineRequest.ResponseSourceEnum>withRequestField("response_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResponseCodeTimelineRequest.ResponseSourceEnum.class),
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getResponseSource,
                ListResponseCodeTimelineRequest::setResponseSource));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResponseCodeTimelineRequest::getGroupBy,
                ListResponseCodeTimelineRequest::setGroupBy));

        // response
        builder.<List<StatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListResponseCodeTimelineResponse::getBody, ListResponseCodeTimelineResponse::setBody)
                .withInnerContainerType(StatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityReportSubscriptionsRequest, ListSecurityReportSubscriptionsResponse> listSecurityReportSubscriptions =
        genForListSecurityReportSubscriptions();

    private static HttpRequestDef<ListSecurityReportSubscriptionsRequest, ListSecurityReportSubscriptionsResponse> genForListSecurityReportSubscriptions() {
        // basic
        HttpRequestDef.Builder<ListSecurityReportSubscriptionsRequest, ListSecurityReportSubscriptionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityReportSubscriptionsRequest.class,
                    ListSecurityReportSubscriptionsResponse.class)
                .withName("ListSecurityReportSubscriptions")
                .withUri("/v1/{project_id}/waf/security-report/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityReportSubscriptionsRequest::getEnterpriseProjectId,
                ListSecurityReportSubscriptionsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("report_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityReportSubscriptionsRequest::getReportName,
                ListSecurityReportSubscriptionsRequest::setReportName));
        builder.<String>withRequestField("report_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityReportSubscriptionsRequest::getReportCategory,
                ListSecurityReportSubscriptionsRequest::setReportCategory));
        builder.<String>withRequestField("report_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityReportSubscriptionsRequest::getReportStatus,
                ListSecurityReportSubscriptionsRequest::setReportStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityReportSubscriptionsRequest::getOffset,
                ListSecurityReportSubscriptionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityReportSubscriptionsRequest::getLimit,
                ListSecurityReportSubscriptionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics =
        genForListStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForListStatistics() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRequest, ListStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRequest.class, ListStatisticsResponse.class)
                .withName("ListStatistics")
                .withUri("/v1/{project_id}/waf/overviews/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getEnterpriseProjectId,
                ListStatisticsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListStatisticsRequest::getFrom, ListStatisticsRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListStatisticsRequest::getTo, ListStatisticsRequest::setTo));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getHosts, ListStatisticsRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getInstances, ListStatisticsRequest::setInstances));

        // response
        builder.<List<CountItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStatisticsResponse::getBody, ListStatisticsResponse::setBody)
                .withInnerContainerType(CountItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormal =
        genForListTopAbnormal();

    private static HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> genForListTopAbnormal() {
        // basic
        HttpRequestDef.Builder<ListTopAbnormalRequest, ListTopAbnormalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopAbnormalRequest.class, ListTopAbnormalResponse.class)
                .withName("ListTopAbnormal")
                .withUri("/v1/{project_id}/waf/overviews/abnormal")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getEnterpriseProjectId,
                ListTopAbnormalRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getFrom, ListTopAbnormalRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getTo, ListTopAbnormalRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getTop, ListTopAbnormalRequest::setTop));
        builder.<Integer>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getCode, ListTopAbnormalRequest::setCode));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getHosts, ListTopAbnormalRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getInstances, ListTopAbnormalRequest::setInstances));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopDomainsRequest, ListTopDomainsResponse> listTopDomains =
        genForListTopDomains();

    private static HttpRequestDef<ListTopDomainsRequest, ListTopDomainsResponse> genForListTopDomains() {
        // basic
        HttpRequestDef.Builder<ListTopDomainsRequest, ListTopDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopDomainsRequest.class, ListTopDomainsResponse.class)
                .withName("ListTopDomains")
                .withUri("/v1/{project_id}/waf/overviews/attack/top-domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopDomainsRequest::getEnterpriseProjectId,
                ListTopDomainsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopDomainsRequest::getFrom, ListTopDomainsRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopDomainsRequest::getTo, ListTopDomainsRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopDomainsRequest::getTop, ListTopDomainsRequest::setTop));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTopDomainsRequest::getHosts, ListTopDomainsRequest::setHosts));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopIpRequest, ListTopIpResponse> listTopIp = genForListTopIp();

    private static HttpRequestDef<ListTopIpRequest, ListTopIpResponse> genForListTopIp() {
        // basic
        HttpRequestDef.Builder<ListTopIpRequest, ListTopIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopIpRequest.class, ListTopIpResponse.class)
                .withName("ListTopIp")
                .withUri("/v1/{project_id}/waf/overviews/attack/ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopIpRequest::getEnterpriseProjectId, ListTopIpRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopIpRequest::getFrom, ListTopIpRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopIpRequest::getTo, ListTopIpRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopIpRequest::getTop, ListTopIpRequest::setTop));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopIpRequest::getHosts, ListTopIpRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopIpRequest::getInstances, ListTopIpRequest::setInstances));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopUrlRequest, ListTopUrlResponse> listTopUrl = genForListTopUrl();

    private static HttpRequestDef<ListTopUrlRequest, ListTopUrlResponse> genForListTopUrl() {
        // basic
        HttpRequestDef.Builder<ListTopUrlRequest, ListTopUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopUrlRequest.class, ListTopUrlResponse.class)
                .withName("ListTopUrl")
                .withUri("/v1/{project_id}/waf/overviews/attack/url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopUrlRequest::getEnterpriseProjectId,
                ListTopUrlRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopUrlRequest::getFrom, ListTopUrlRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopUrlRequest::getTo, ListTopUrlRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopUrlRequest::getTop, ListTopUrlRequest::setTop));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopUrlRequest::getHosts, ListTopUrlRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopUrlRequest::getInstances, ListTopUrlRequest::setInstances));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListValueListRequest, ListValueListResponse> listValueList =
        genForListValueList();

    private static HttpRequestDef<ListValueListRequest, ListValueListResponse> genForListValueList() {
        // basic
        HttpRequestDef.Builder<ListValueListRequest, ListValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListValueListRequest.class, ListValueListResponse.class)
                .withName("ListValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPage, ListValueListRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPagesize, ListValueListRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListValueListRequest::getName, ListValueListRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebBasicProtectionRulesRequest, ListWebBasicProtectionRulesResponse> listWebBasicProtectionRules =
        genForListWebBasicProtectionRules();

    private static HttpRequestDef<ListWebBasicProtectionRulesRequest, ListWebBasicProtectionRulesResponse> genForListWebBasicProtectionRules() {
        // basic
        HttpRequestDef.Builder<ListWebBasicProtectionRulesRequest, ListWebBasicProtectionRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListWebBasicProtectionRulesRequest.class,
                    ListWebBasicProtectionRulesResponse.class)
                .withName("ListWebBasicProtectionRules")
                .withUri("/v1/{project_id}/waf/policy/basic-protection/default-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getEnterpriseProjectId,
                ListWebBasicProtectionRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getOffset,
                ListWebBasicProtectionRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getLimit,
                ListWebBasicProtectionRulesRequest::setLimit));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getFrom,
                ListWebBasicProtectionRulesRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getTo,
                ListWebBasicProtectionRulesRequest::setTo));
        builder.<ListWebBasicProtectionRulesRequest.LevelEnum>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWebBasicProtectionRulesRequest.LevelEnum.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getLevel,
                ListWebBasicProtectionRulesRequest::setLevel));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getId,
                ListWebBasicProtectionRulesRequest::setId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getDescription,
                ListWebBasicProtectionRulesRequest::setDescription));
        builder.<String>withRequestField("cve_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getCveNumber,
                ListWebBasicProtectionRulesRequest::setCveNumber));
        builder.<ListWebBasicProtectionRulesRequest.RiskLevelEnum>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWebBasicProtectionRulesRequest.RiskLevelEnum.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getRiskLevel,
                ListWebBasicProtectionRulesRequest::setRiskLevel));
        builder.<ListWebBasicProtectionRulesRequest.ProtectionTypeNamesEnum>withRequestField("protection_type_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWebBasicProtectionRulesRequest.ProtectionTypeNamesEnum.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getProtectionTypeNames,
                ListWebBasicProtectionRulesRequest::setProtectionTypeNames));
        builder.<String>withRequestField("application_type_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getApplicationTypeNames,
                ListWebBasicProtectionRulesRequest::setApplicationTypeNames));
        builder.<ListWebBasicProtectionRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWebBasicProtectionRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListWebBasicProtectionRulesRequest::getXLanguage,
                ListWebBasicProtectionRulesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhiteblackipPolicyRulesRequest, ListWhiteblackipPolicyRulesResponse> listWhiteblackipPolicyRules =
        genForListWhiteblackipPolicyRules();

    private static HttpRequestDef<ListWhiteblackipPolicyRulesRequest, ListWhiteblackipPolicyRulesResponse> genForListWhiteblackipPolicyRules() {
        // basic
        HttpRequestDef.Builder<ListWhiteblackipPolicyRulesRequest, ListWhiteblackipPolicyRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListWhiteblackipPolicyRulesRequest.class,
                    ListWhiteblackipPolicyRulesResponse.class)
                .withName("ListWhiteblackipPolicyRules")
                .withUri("/v1/{projectid}/waf/rule/whiteblackip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipPolicyRulesRequest::getProjectid,
                ListWhiteblackipPolicyRulesRequest::setProjectid));
        builder.<String>withRequestField("policyids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipPolicyRulesRequest::getPolicyids,
                ListWhiteblackipPolicyRulesRequest::setPolicyids));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipPolicyRulesRequest::getEnterpriseProjectId,
                ListWhiteblackipPolicyRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipPolicyRulesRequest::getPage,
                ListWhiteblackipPolicyRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipPolicyRulesRequest::getPagesize,
                ListWhiteblackipPolicyRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRule =
        genForListWhiteblackipRule();

    private static HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> genForListWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWhiteblackipRuleRequest.class, ListWhiteblackipRuleResponse.class)
            .withName("ListWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPolicyId, ListWhiteblackipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getEnterpriseProjectId,
                ListWhiteblackipRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPage, ListWhiteblackipRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPagesize, ListWhiteblackipRuleRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getName, ListWhiteblackipRuleRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> migrateCompositeHosts =
        genForMigrateCompositeHosts();

    private static HttpRequestDef<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> genForMigrateCompositeHosts() {
        // basic
        HttpRequestDef.Builder<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, MigrateCompositeHostsRequest.class, MigrateCompositeHostsResponse.class)
            .withName("MigrateCompositeHosts")
            .withUri("/v1/{project_id}/composite-waf/hosts/migration")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getEnterpriseProjectId,
                MigrateCompositeHostsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("target_enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getTargetEnterpriseProjectId,
                MigrateCompositeHostsRequest::setTargetEnterpriseProjectId));
        builder.<MigrateCompositeHostsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateCompositeHostsRequestBody.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getBody, MigrateCompositeHostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenameInstanceRequest, RenameInstanceResponse> renameInstance =
        genForRenameInstance();

    private static HttpRequestDef<RenameInstanceRequest, RenameInstanceResponse> genForRenameInstance() {
        // basic
        HttpRequestDef.Builder<RenameInstanceRequest, RenameInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RenameInstanceRequest.class, RenameInstanceResponse.class)
                .withName("RenameInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceRequest::getInstanceId, RenameInstanceRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceRequest::getEnterpriseProjectId,
                RenameInstanceRequest::setEnterpriseProjectId));
        builder.<RenameInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RenameInstanceRequestBody.class),
            f -> f.withMarshaller(RenameInstanceRequest::getBody, RenameInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRule =
        genForShowAnticrawlerRule();

    private static HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> genForShowAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAnticrawlerRuleRequest.class, ShowAnticrawlerRuleResponse.class)
                .withName("ShowAnticrawlerRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getPolicyId, ShowAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getRuleId, ShowAnticrawlerRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getEnterpriseProjectId,
                ShowAnticrawlerRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRule =
        genForShowAntileakageRule();

    private static HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> genForShowAntileakageRule() {
        // basic
        HttpRequestDef.Builder<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntileakageRuleRequest.class, ShowAntileakageRuleResponse.class)
                .withName("ShowAntileakageRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getPolicyId, ShowAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getRuleId, ShowAntileakageRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getEnterpriseProjectId,
                ShowAntileakageRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> showAntitamperRule =
        genForShowAntitamperRule();

    private static HttpRequestDef<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> genForShowAntitamperRule() {
        // basic
        HttpRequestDef.Builder<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntitamperRuleRequest.class, ShowAntitamperRuleResponse.class)
                .withName("ShowAntitamperRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getPolicyId, ShowAntitamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getRuleId, ShowAntitamperRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getEnterpriseProjectId,
                ShowAntitamperRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCcRuleRequest, ShowCcRuleResponse> showCcRule = genForShowCcRule();

    private static HttpRequestDef<ShowCcRuleRequest, ShowCcRuleResponse> genForShowCcRule() {
        // basic
        HttpRequestDef.Builder<ShowCcRuleRequest, ShowCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCcRuleRequest.class, ShowCcRuleResponse.class)
                .withName("ShowCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getPolicyId, ShowCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getRuleId, ShowCcRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getEnterpriseProjectId,
                ShowCcRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForShowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForShowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, ShowCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getEnterpriseProjectId,
                ShowCertificateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHost =
        genForShowCompositeHost();

    private static HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> genForShowCompositeHost() {
        // basic
        HttpRequestDef.Builder<ShowCompositeHostRequest, ShowCompositeHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCompositeHostRequest.class, ShowCompositeHostResponse.class)
                .withName("ShowCompositeHost")
                .withUri("/v1/{project_id}/composite-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompositeHostRequest::getHostId, ShowCompositeHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompositeHostRequest::getEnterpriseProjectId,
                ShowCompositeHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfig =
        genForShowConsoleConfig();

    private static HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> genForShowConsoleConfig() {
        // basic
        HttpRequestDef.Builder<ShowConsoleConfigRequest, ShowConsoleConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConsoleConfigRequest.class, ShowConsoleConfigResponse.class)
                .withName("ShowConsoleConfig")
                .withUri("/v1/{project_id}/waf/config/console")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRule =
        genForShowCustomRule();

    private static HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> genForShowCustomRule() {
        // basic
        HttpRequestDef.Builder<ShowCustomRuleRequest, ShowCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomRuleRequest.class, ShowCustomRuleResponse.class)
                .withName("ShowCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getPolicyId, ShowCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getRuleId, ShowCustomRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getEnterpriseProjectId,
                ShowCustomRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventRequest, ShowEventResponse> showEvent = genForShowEvent();

    private static HttpRequestDef<ShowEventRequest, ShowEventResponse> genForShowEvent() {
        // basic
        HttpRequestDef.Builder<ShowEventRequest, ShowEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventRequest.class, ShowEventResponse.class)
                .withName("ShowEvent")
                .withUri("/v1/{project_id}/waf/event/{eventid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEventid, ShowEventRequest::setEventid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEnterpriseProjectId, ShowEventRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getXLanguage, ShowEventRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRule =
        genForShowGeoipRule();

    private static HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> genForShowGeoipRule() {
        // basic
        HttpRequestDef.Builder<ShowGeoipRuleRequest, ShowGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGeoipRuleRequest.class, ShowGeoipRuleResponse.class)
                .withName("ShowGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getPolicyId, ShowGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getRuleId, ShowGeoipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getEnterpriseProjectId,
                ShowGeoipRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostRequest, ShowHostResponse> showHost = genForShowHost();

    private static HttpRequestDef<ShowHostRequest, ShowHostResponse> genForShowHost() {
        // basic
        HttpRequestDef.Builder<ShowHostRequest, ShowHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHostRequest.class, ShowHostResponse.class)
                .withName("ShowHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostRequest::getInstanceId, ShowHostRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostRequest::getEnterpriseProjectId, ShowHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostStatusRequest, ShowHostStatusResponse> showHostStatus =
        genForShowHostStatus();

    private static HttpRequestDef<ShowHostStatusRequest, ShowHostStatusResponse> genForShowHostStatus() {
        // basic
        HttpRequestDef.Builder<ShowHostStatusRequest, ShowHostStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHostStatusRequest.class, ShowHostStatusResponse.class)
                .withName("ShowHostStatus")
                .withUri("/v1/{project_id}/waf/instance/{host_id}/host-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostStatusRequest::getHostId, ShowHostStatusRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> showIgnoreRule =
        genForShowIgnoreRule();

    private static HttpRequestDef<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> genForShowIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIgnoreRuleRequest.class, ShowIgnoreRuleResponse.class)
                .withName("ShowIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getPolicyId, ShowIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getRuleId, ShowIgnoreRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getEnterpriseProjectId,
                ShowIgnoreRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getEnterpriseProjectId,
                ShowInstanceRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroup = genForShowIpGroup();

    private static HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> genForShowIpGroup() {
        // basic
        HttpRequestDef.Builder<ShowIpGroupRequest, ShowIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpGroupRequest.class, ShowIpGroupResponse.class)
                .withName("ShowIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getId, ShowIpGroupRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getEnterpriseProjectId,
                ShowIpGroupRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> showLtsInfoConfig =
        genForShowLtsInfoConfig();

    private static HttpRequestDef<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> genForShowLtsInfoConfig() {
        // basic
        HttpRequestDef.Builder<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLtsInfoConfigRequest.class, ShowLtsInfoConfigResponse.class)
                .withName("ShowLtsInfoConfig")
                .withUri("/v1/{project_id}/waf/config/lts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsInfoConfigRequest::getEnterpriseProjectId,
                ShowLtsInfoConfigRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForShowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForShowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, ShowPolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getEnterpriseProjectId,
                ShowPolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyGeoipMapRequest, ShowPolicyGeoipMapResponse> showPolicyGeoipMap =
        genForShowPolicyGeoipMap();

    private static HttpRequestDef<ShowPolicyGeoipMapRequest, ShowPolicyGeoipMapResponse> genForShowPolicyGeoipMap() {
        // basic
        HttpRequestDef.Builder<ShowPolicyGeoipMapRequest, ShowPolicyGeoipMapResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyGeoipMapRequest.class, ShowPolicyGeoipMapResponse.class)
                .withName("ShowPolicyGeoipMap")
                .withUri("/v1/{project_id}/waf/tag/geoip/map")
                .withContentType("application/json");

        // requests
        builder.<ShowPolicyGeoipMapRequest.LangEnum>withRequestField("lang",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPolicyGeoipMapRequest.LangEnum.class),
            f -> f.withMarshaller(ShowPolicyGeoipMapRequest::getLang, ShowPolicyGeoipMapRequest::setLang));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHost =
        genForShowPremiumHost();

    private static HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> genForShowPremiumHost() {
        // basic
        HttpRequestDef.Builder<ShowPremiumHostRequest, ShowPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPremiumHostRequest.class, ShowPremiumHostResponse.class)
                .withName("ShowPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPremiumHostRequest::getHostId, ShowPremiumHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPremiumHostRequest::getEnterpriseProjectId,
                ShowPremiumHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> showPrivacyRule =
        genForShowPrivacyRule();

    private static HttpRequestDef<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> genForShowPrivacyRule() {
        // basic
        HttpRequestDef.Builder<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivacyRuleRequest.class, ShowPrivacyRuleResponse.class)
                .withName("ShowPrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getPolicyId, ShowPrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getRuleId, ShowPrivacyRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getEnterpriseProjectId,
                ShowPrivacyRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> showPunishmentRule =
        genForShowPunishmentRule();

    private static HttpRequestDef<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> genForShowPunishmentRule() {
        // basic
        HttpRequestDef.Builder<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPunishmentRuleRequest.class, ShowPunishmentRuleResponse.class)
                .withName("ShowPunishmentRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getPolicyId, ShowPunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getRuleId, ShowPunishmentRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getEnterpriseProjectId,
                ShowPunishmentRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSourceIpRequest, ShowSourceIpResponse> showSourceIp = genForShowSourceIp();

    private static HttpRequestDef<ShowSourceIpRequest, ShowSourceIpResponse> genForShowSourceIp() {
        // basic
        HttpRequestDef.Builder<ShowSourceIpRequest, ShowSourceIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSourceIpRequest.class, ShowSourceIpResponse.class)
                .withName("ShowSourceIp")
                .withUri("/v1/{project_id}/waf/config/source-ip")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> showSubscriptionInfo =
        genForShowSubscriptionInfo();

    private static HttpRequestDef<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> genForShowSubscriptionInfo() {
        // basic
        HttpRequestDef.Builder<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSubscriptionInfoRequest.class, ShowSubscriptionInfoResponse.class)
            .withName("ShowSubscriptionInfo")
            .withUri("/v1/{project_id}/waf/subscription")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowValueListRequest, ShowValueListResponse> showValueList =
        genForShowValueList();

    private static HttpRequestDef<ShowValueListRequest, ShowValueListResponse> genForShowValueList() {
        // basic
        HttpRequestDef.Builder<ShowValueListRequest, ShowValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowValueListRequest.class, ShowValueListResponse.class)
                .withName("ShowValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowValueListRequest::getValuelistid, ShowValueListRequest::setValuelistid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowValueListRequest::getEnterpriseProjectId,
                ShowValueListRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> showWhiteBlackIpRule =
        genForShowWhiteBlackIpRule();

    private static HttpRequestDef<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> genForShowWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWhiteBlackIpRuleRequest.class, ShowWhiteBlackIpRuleResponse.class)
            .withName("ShowWhiteBlackIpRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getPolicyId, ShowWhiteBlackIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getRuleId, ShowWhiteBlackIpRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getEnterpriseProjectId,
                ShowWhiteBlackIpRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessProgressRequest, UpdateAccessProgressResponse> updateAccessProgress =
        genForUpdateAccessProgress();

    private static HttpRequestDef<UpdateAccessProgressRequest, UpdateAccessProgressResponse> genForUpdateAccessProgress() {
        // basic
        HttpRequestDef.Builder<UpdateAccessProgressRequest, UpdateAccessProgressResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAccessProgressRequest.class, UpdateAccessProgressResponse.class)
            .withName("UpdateAccessProgress")
            .withUri("/v1/{project_id}/waf/instance/{instance_id}/access-progress")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessProgressRequest::getInstanceId,
                UpdateAccessProgressRequest::setInstanceId));
        builder.<AccessProgress>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessProgress.class),
            f -> f.withMarshaller(UpdateAccessProgressRequest::getBody, UpdateAccessProgressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> updateAlertNoticeConfig =
        genForUpdateAlertNoticeConfig();

    private static HttpRequestDef<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> genForUpdateAlertNoticeConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAlertNoticeConfigRequest.class, UpdateAlertNoticeConfigResponse.class)
            .withName("UpdateAlertNoticeConfig")
            .withUri("/v2/{project_id}/waf/alert/{alert_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getAlertId,
                UpdateAlertNoticeConfigRequest::setAlertId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getXLanguage,
                UpdateAlertNoticeConfigRequest::setXLanguage));
        builder.<UpdateAlertNoticeConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertNoticeConfigRequestBody.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getBody, UpdateAlertNoticeConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> updateAntiTamperRuleRefresh =
        genForUpdateAntiTamperRuleRefresh();

    private static HttpRequestDef<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> genForUpdateAntiTamperRuleRefresh() {
        // basic
        HttpRequestDef.Builder<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAntiTamperRuleRefreshRequest.class,
                    UpdateAntiTamperRuleRefreshResponse.class)
                .withName("UpdateAntiTamperRuleRefresh")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}/refresh")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getPolicyId,
                UpdateAntiTamperRuleRefreshRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getRuleId,
                UpdateAntiTamperRuleRefreshRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getEnterpriseProjectId,
                UpdateAntiTamperRuleRefreshRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRule =
        genForUpdateAnticrawlerRule();

    private static HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> genForUpdateAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAnticrawlerRuleRequest.class, UpdateAnticrawlerRuleResponse.class)
            .withName("UpdateAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getPolicyId,
                UpdateAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getRuleId, UpdateAnticrawlerRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getEnterpriseProjectId,
                UpdateAnticrawlerRuleRequest::setEnterpriseProjectId));
        builder.<UpdateAnticrawlerRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnticrawlerRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getBody, UpdateAnticrawlerRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> updateAnticrawlerRuleType =
        genForUpdateAnticrawlerRuleType();

    private static HttpRequestDef<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> genForUpdateAnticrawlerRuleType() {
        // basic
        HttpRequestDef.Builder<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAnticrawlerRuleTypeRequest.class,
                    UpdateAnticrawlerRuleTypeResponse.class)
                .withName("UpdateAnticrawlerRuleType")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getPolicyId,
                UpdateAnticrawlerRuleTypeRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getEnterpriseProjectId,
                UpdateAnticrawlerRuleTypeRequest::setEnterpriseProjectId));
        builder.<UpdateAnticrawlerRuleTypeRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnticrawlerRuleTypeRequestbody.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getBody,
                UpdateAnticrawlerRuleTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRule =
        genForUpdateAntileakageRule();

    private static HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> genForUpdateAntileakageRule() {
        // basic
        HttpRequestDef.Builder<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAntileakageRuleRequest.class, UpdateAntileakageRuleResponse.class)
            .withName("UpdateAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getPolicyId,
                UpdateAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getRuleId, UpdateAntileakageRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getEnterpriseProjectId,
                UpdateAntileakageRuleRequest::setEnterpriseProjectId));
        builder.<UpdateAntileakageRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAntileakageRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getBody, UpdateAntileakageRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBotMCategoryStatusRequest, UpdateBotMCategoryStatusResponse> updateBotMCategoryStatus =
        genForUpdateBotMCategoryStatus();

    private static HttpRequestDef<UpdateBotMCategoryStatusRequest, UpdateBotMCategoryStatusResponse> genForUpdateBotMCategoryStatus() {
        // basic
        HttpRequestDef.Builder<UpdateBotMCategoryStatusRequest, UpdateBotMCategoryStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateBotMCategoryStatusRequest.class, UpdateBotMCategoryStatusResponse.class)
                .withName("UpdateBotMCategoryStatus")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/bot-manager/category/{category_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBotMCategoryStatusRequest::getPolicyId,
                UpdateBotMCategoryStatusRequest::setPolicyId));
        builder.<String>withRequestField("category_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBotMCategoryStatusRequest::getCategoryId,
                UpdateBotMCategoryStatusRequest::setCategoryId));
        builder.<UpdateBotMRuleStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBotMRuleStatusRequestBody.class),
            f -> f.withMarshaller(UpdateBotMCategoryStatusRequest::getBody, UpdateBotMCategoryStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBotMRuleDefenseStrategyRequest, UpdateBotMRuleDefenseStrategyResponse> updateBotMRuleDefenseStrategy =
        genForUpdateBotMRuleDefenseStrategy();

    private static HttpRequestDef<UpdateBotMRuleDefenseStrategyRequest, UpdateBotMRuleDefenseStrategyResponse> genForUpdateBotMRuleDefenseStrategy() {
        // basic
        HttpRequestDef.Builder<UpdateBotMRuleDefenseStrategyRequest, UpdateBotMRuleDefenseStrategyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBotMRuleDefenseStrategyRequest.class,
                    UpdateBotMRuleDefenseStrategyResponse.class)
                .withName("UpdateBotMRuleDefenseStrategy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/bot-manager/rule/defense-strategy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBotMRuleDefenseStrategyRequest::getPolicyId,
                UpdateBotMRuleDefenseStrategyRequest::setPolicyId));
        builder.<UpdateBotMRuleDefenseStrategyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBotMRuleDefenseStrategyRequestBody.class),
            f -> f.withMarshaller(UpdateBotMRuleDefenseStrategyRequest::getBody,
                UpdateBotMRuleDefenseStrategyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCcRuleRequest, UpdateCcRuleResponse> updateCcRule = genForUpdateCcRule();

    private static HttpRequestDef<UpdateCcRuleRequest, UpdateCcRuleResponse> genForUpdateCcRule() {
        // basic
        HttpRequestDef.Builder<UpdateCcRuleRequest, UpdateCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCcRuleRequest.class, UpdateCcRuleResponse.class)
                .withName("UpdateCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getPolicyId, UpdateCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getRuleId, UpdateCcRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getEnterpriseProjectId,
                UpdateCcRuleRequest::setEnterpriseProjectId));
        builder.<UpdateCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCcRuleRequestBody.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getBody, UpdateCcRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForUpdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForUpdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId,
                UpdateCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getEnterpriseProjectId,
                UpdateCertificateRequest::setEnterpriseProjectId));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, UpdateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRule =
        genForUpdateCustomRule();

    private static HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> genForUpdateCustomRule() {
        // basic
        HttpRequestDef.Builder<UpdateCustomRuleRequest, UpdateCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCustomRuleRequest.class, UpdateCustomRuleResponse.class)
                .withName("UpdateCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getPolicyId, UpdateCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getRuleId, UpdateCustomRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getEnterpriseProjectId,
                UpdateCustomRuleRequest::setEnterpriseProjectId));
        builder.<UpdateCustomRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCustomRuleRequestBody.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getBody, UpdateCustomRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRule =
        genForUpdateGeoipRule();

    private static HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> genForUpdateGeoipRule() {
        // basic
        HttpRequestDef.Builder<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGeoipRuleRequest.class, UpdateGeoipRuleResponse.class)
                .withName("UpdateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getPolicyId, UpdateGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getRuleId, UpdateGeoipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getEnterpriseProjectId,
                UpdateGeoipRuleRequest::setEnterpriseProjectId));
        builder.<UpdateGeoipRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGeoipRuleRequestBody.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getBody, UpdateGeoipRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostRequest, UpdateHostResponse> updateHost = genForUpdateHost();

    private static HttpRequestDef<UpdateHostRequest, UpdateHostResponse> genForUpdateHost() {
        // basic
        HttpRequestDef.Builder<UpdateHostRequest, UpdateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateHostRequest.class, UpdateHostResponse.class)
                .withName("UpdateHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostRequest::getInstanceId, UpdateHostRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostRequest::getEnterpriseProjectId,
                UpdateHostRequest::setEnterpriseProjectId));
        builder.<UpdateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostRequestBody.class),
            f -> f.withMarshaller(UpdateHostRequest::getBody, UpdateHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostAccessStatusOfUnderlineRequest, UpdateHostAccessStatusOfUnderlineResponse> updateHostAccessStatusOfUnderline =
        genForUpdateHostAccessStatusOfUnderline();

    private static HttpRequestDef<UpdateHostAccessStatusOfUnderlineRequest, UpdateHostAccessStatusOfUnderlineResponse> genForUpdateHostAccessStatusOfUnderline() {
        // basic
        HttpRequestDef.Builder<UpdateHostAccessStatusOfUnderlineRequest, UpdateHostAccessStatusOfUnderlineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHostAccessStatusOfUnderlineRequest.class,
                    UpdateHostAccessStatusOfUnderlineResponse.class)
                .withName("UpdateHostAccessStatusOfUnderline")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}/access-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostAccessStatusOfUnderlineRequest::getInstanceId,
                UpdateHostAccessStatusOfUnderlineRequest::setInstanceId));
        builder.<AccessStatusBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessStatusBody.class),
            f -> f.withMarshaller(UpdateHostAccessStatusOfUnderlineRequest::getBody,
                UpdateHostAccessStatusOfUnderlineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatus =
        genForUpdateHostProtectStatus();

    private static HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> genForUpdateHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHostProtectStatusRequest.class, UpdateHostProtectStatusResponse.class)
            .withName("UpdateHostProtectStatus")
            .withUri("/v1/{project_id}/waf/instance/{instance_id}/protect-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getInstanceId,
                UpdateHostProtectStatusRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getEnterpriseProjectId,
                UpdateHostProtectStatusRequest::setEnterpriseProjectId));
        builder.<UpdateHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getBody, UpdateHostProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> updateIgnoreRule =
        genForUpdateIgnoreRule();

    private static HttpRequestDef<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> genForUpdateIgnoreRule() {
        // basic
        HttpRequestDef.Builder<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIgnoreRuleRequest.class, UpdateIgnoreRuleResponse.class)
                .withName("UpdateIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getPolicyId, UpdateIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getRuleId, UpdateIgnoreRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getEnterpriseProjectId,
                UpdateIgnoreRuleRequest::setEnterpriseProjectId));
        builder.<UpdateIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getBody, UpdateIgnoreRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRouteRequest, UpdateInstanceRouteResponse> updateInstanceRoute =
        genForUpdateInstanceRoute();

    private static HttpRequestDef<UpdateInstanceRouteRequest, UpdateInstanceRouteResponse> genForUpdateInstanceRoute() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRouteRequest, UpdateInstanceRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRouteRequest.class, UpdateInstanceRouteResponse.class)
                .withName("UpdateInstanceRoute")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}/route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRouteRequest::getInstanceId,
                UpdateInstanceRouteRequest::setInstanceId));
        builder.<List<RouteBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateInstanceRouteRequest::getBody, UpdateInstanceRouteRequest::setBody)
                .withInnerContainerType(RouteBody.class));

        // response
        builder.<List<RouteBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateInstanceRouteResponse::getBody, UpdateInstanceRouteResponse::setBody)
                .withInnerContainerType(RouteBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroup =
        genForUpdateIpGroup();

    private static HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> genForUpdateIpGroup() {
        // basic
        HttpRequestDef.Builder<UpdateIpGroupRequest, UpdateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpGroupRequest.class, UpdateIpGroupResponse.class)
                .withName("UpdateIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getId, UpdateIpGroupRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getEnterpriseProjectId,
                UpdateIpGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getAction, UpdateIpGroupRequest::setAction));
        builder.<UpdateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIpGroupRequestBody.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getBody, UpdateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpReputationRuleRequest, UpdateIpReputationRuleResponse> updateIpReputationRule =
        genForUpdateIpReputationRule();

    private static HttpRequestDef<UpdateIpReputationRuleRequest, UpdateIpReputationRuleResponse> genForUpdateIpReputationRule() {
        // basic
        HttpRequestDef.Builder<UpdateIpReputationRuleRequest, UpdateIpReputationRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateIpReputationRuleRequest.class, UpdateIpReputationRuleResponse.class)
            .withName("UpdateIpReputationRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/ip-reputation/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpReputationRuleRequest::getPolicyId,
                UpdateIpReputationRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpReputationRuleRequest::getRuleId, UpdateIpReputationRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpReputationRuleRequest::getEnterpriseProjectId,
                UpdateIpReputationRuleRequest::setEnterpriseProjectId));
        builder.<UpdateIpReputationRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIpReputationRuleRequestBody.class),
            f -> f.withMarshaller(UpdateIpReputationRuleRequest::getBody, UpdateIpReputationRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> updateLtsInfoConfig =
        genForUpdateLtsInfoConfig();

    private static HttpRequestDef<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> genForUpdateLtsInfoConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLtsInfoConfigRequest.class, UpdateLtsInfoConfigResponse.class)
                .withName("UpdateLtsInfoConfig")
                .withUri("/v1/{project_id}/waf/config/lts/{ltsconfig_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ltsconfig_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getLtsconfigId,
                UpdateLtsInfoConfigRequest::setLtsconfigId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getEnterpriseProjectId,
                UpdateLtsInfoConfigRequest::setEnterpriseProjectId));
        builder.<UpdateLtsInfoConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLtsInfoConfigRequestBody.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getBody, UpdateLtsInfoConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getEnterpriseProjectId,
                UpdatePolicyRequest::setEnterpriseProjectId));
        builder.<UpdatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHost =
        genForUpdatePolicyProtectHost();

    private static HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> genForUpdatePolicyProtectHost() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyProtectHostRequest.class, UpdatePolicyProtectHostResponse.class)
            .withName("UpdatePolicyProtectHost")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getPolicyId,
                UpdatePolicyProtectHostRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getEnterpriseProjectId,
                UpdatePolicyProtectHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getHosts, UpdatePolicyProtectHostRequest::setHosts));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatus =
        genForUpdatePolicyRuleStatus();

    private static HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> genForUpdatePolicyRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyRuleStatusRequest.class, UpdatePolicyRuleStatusResponse.class)
            .withName("UpdatePolicyRuleStatus")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/{ruletype}/{rule_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getPolicyId,
                UpdatePolicyRuleStatusRequest::setPolicyId));
        builder.<UpdatePolicyRuleStatusRequest.RuletypeEnum>withRequestField("ruletype",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRuleStatusRequest.RuletypeEnum.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuletype,
                UpdatePolicyRuleStatusRequest::setRuletype));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuleId, UpdatePolicyRuleStatusRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getEnterpriseProjectId,
                UpdatePolicyRuleStatusRequest::setEnterpriseProjectId));
        builder.<UpdatePolicyRuleStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRuleStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getBody, UpdatePolicyRuleStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHost =
        genForUpdatePremiumHost();

    private static HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> genForUpdatePremiumHost() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostRequest, UpdatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePremiumHostRequest.class, UpdatePremiumHostResponse.class)
                .withName("UpdatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getHostId, UpdatePremiumHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getEnterpriseProjectId,
                UpdatePremiumHostRequest::setEnterpriseProjectId));
        builder.<UpdatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getBody, UpdatePremiumHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatus =
        genForUpdatePremiumHostAccessStatus();

    private static HttpRequestDef<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> genForUpdatePremiumHostAccessStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePremiumHostAccessStatusRequest.class,
                    UpdatePremiumHostAccessStatusResponse.class)
                .withName("UpdatePremiumHostAccessStatus")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}/access-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostAccessStatusRequest::getHostId,
                UpdatePremiumHostAccessStatusRequest::setHostId));
        builder.<UpdatePremiumHostAccessStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostAccessStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostAccessStatusRequest::getBody,
                UpdatePremiumHostAccessStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatus =
        genForUpdatePremiumHostProtectStatus();

    private static HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> genForUpdatePremiumHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePremiumHostProtectStatusRequest.class,
                    UpdatePremiumHostProtectStatusResponse.class)
                .withName("UpdatePremiumHostProtectStatus")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}/protect-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getHostId,
                UpdatePremiumHostProtectStatusRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getEnterpriseProjectId,
                UpdatePremiumHostProtectStatusRequest::setEnterpriseProjectId));
        builder.<UpdatePremiumHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getBody,
                UpdatePremiumHostProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumInstanceRequest, UpdatePremiumInstanceResponse> updatePremiumInstance =
        genForUpdatePremiumInstance();

    private static HttpRequestDef<UpdatePremiumInstanceRequest, UpdatePremiumInstanceResponse> genForUpdatePremiumInstance() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumInstanceRequest, UpdatePremiumInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdatePremiumInstanceRequest.class, UpdatePremiumInstanceResponse.class)
            .withName("UpdatePremiumInstance")
            .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumInstanceRequest::getInstanceId,
                UpdatePremiumInstanceRequest::setInstanceId));
        builder.<UpdatePremiumInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumInstanceRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumInstanceRequest::getBody, UpdatePremiumInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRule =
        genForUpdatePrivacyRule();

    private static HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> genForUpdatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrivacyRuleRequest.class, UpdatePrivacyRuleResponse.class)
                .withName("UpdatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getPolicyId, UpdatePrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getRuleId, UpdatePrivacyRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getEnterpriseProjectId,
                UpdatePrivacyRuleRequest::setEnterpriseProjectId));
        builder.<UpdatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getBody, UpdatePrivacyRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> updatePunishmentRule =
        genForUpdatePunishmentRule();

    private static HttpRequestDef<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> genForUpdatePunishmentRule() {
        // basic
        HttpRequestDef.Builder<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePunishmentRuleRequest.class, UpdatePunishmentRuleResponse.class)
            .withName("UpdatePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getPolicyId, UpdatePunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getRuleId, UpdatePunishmentRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getEnterpriseProjectId,
                UpdatePunishmentRuleRequest::setEnterpriseProjectId));
        builder.<UpdatePunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePunishmentRuleRequestBody.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getBody, UpdatePunishmentRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> updateValueList =
        genForUpdateValueList();

    private static HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> genForUpdateValueList() {
        // basic
        HttpRequestDef.Builder<UpdateValueListRequest, UpdateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateValueListRequest.class, UpdateValueListResponse.class)
                .withName("UpdateValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateValueListRequest::getValuelistid, UpdateValueListRequest::setValuelistid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateValueListRequest::getEnterpriseProjectId,
                UpdateValueListRequest::setEnterpriseProjectId));
        builder.<UpdateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateValueListRequestBody.class),
            f -> f.withMarshaller(UpdateValueListRequest::getBody, UpdateValueListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRule =
        genForUpdateWhiteblackipRule();

    private static HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> genForUpdateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWhiteblackipRuleRequest.class, UpdateWhiteblackipRuleResponse.class)
            .withName("UpdateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getPolicyId,
                UpdateWhiteblackipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getRuleId, UpdateWhiteblackipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getEnterpriseProjectId,
                UpdateWhiteblackipRuleRequest::setEnterpriseProjectId));
        builder.<UpdateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getBody, UpdateWhiteblackipRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQuickAccessDomainRequest, CreateQuickAccessDomainResponse> createQuickAccessDomain =
        genForCreateQuickAccessDomain();

    private static HttpRequestDef<CreateQuickAccessDomainRequest, CreateQuickAccessDomainResponse> genForCreateQuickAccessDomain() {
        // basic
        HttpRequestDef.Builder<CreateQuickAccessDomainRequest, CreateQuickAccessDomainResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateQuickAccessDomainRequest.class, CreateQuickAccessDomainResponse.class)
            .withName("CreateQuickAccessDomain")
            .withUri("/v1/{projectid}/waf/dns-domain/{instanceid}/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuickAccessDomainRequest::getProjectid,
                CreateQuickAccessDomainRequest::setProjectid));
        builder.<String>withRequestField("instanceid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuickAccessDomainRequest::getInstanceid,
                CreateQuickAccessDomainRequest::setInstanceid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuickAccessDomainRequest::getEnterpriseProjectId,
                CreateQuickAccessDomainRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityReportSubscriptionRequest, CreateSecurityReportSubscriptionResponse> createSecurityReportSubscription =
        genForCreateSecurityReportSubscription();

    private static HttpRequestDef<CreateSecurityReportSubscriptionRequest, CreateSecurityReportSubscriptionResponse> genForCreateSecurityReportSubscription() {
        // basic
        HttpRequestDef.Builder<CreateSecurityReportSubscriptionRequest, CreateSecurityReportSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSecurityReportSubscriptionRequest.class,
                    CreateSecurityReportSubscriptionResponse.class)
                .withName("CreateSecurityReportSubscription")
                .withUri("/v1/{project_id}/waf/security-report/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<CreateSecurityReportSubscriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityReportSubscriptionRequestBody.class),
            f -> f.withMarshaller(CreateSecurityReportSubscriptionRequest::getBody,
                CreateSecurityReportSubscriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityReportSubscriptionRequest, DeleteSecurityReportSubscriptionResponse> deleteSecurityReportSubscription =
        genForDeleteSecurityReportSubscription();

    private static HttpRequestDef<DeleteSecurityReportSubscriptionRequest, DeleteSecurityReportSubscriptionResponse> genForDeleteSecurityReportSubscription() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityReportSubscriptionRequest, DeleteSecurityReportSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSecurityReportSubscriptionRequest.class,
                    DeleteSecurityReportSubscriptionResponse.class)
                .withName("DeleteSecurityReportSubscription")
                .withUri("/v1/{project_id}/waf/security-report/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityReportSubscriptionRequest::getSubscriptionId,
                DeleteSecurityReportSubscriptionRequest::setSubscriptionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityReportHistoryPeriodsRequest, ListSecurityReportHistoryPeriodsResponse> listSecurityReportHistoryPeriods =
        genForListSecurityReportHistoryPeriods();

    private static HttpRequestDef<ListSecurityReportHistoryPeriodsRequest, ListSecurityReportHistoryPeriodsResponse> genForListSecurityReportHistoryPeriods() {
        // basic
        HttpRequestDef.Builder<ListSecurityReportHistoryPeriodsRequest, ListSecurityReportHistoryPeriodsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityReportHistoryPeriodsRequest.class,
                    ListSecurityReportHistoryPeriodsResponse.class)
                .withName("ListSecurityReportHistoryPeriods")
                .withUri("/v1/{project_id}/waf/security-report/history-periods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityReportHistoryPeriodsRequest::getSubscriptionId,
                ListSecurityReportHistoryPeriodsRequest::setSubscriptionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityReportHistoryPeriodsRequest::getLimit,
                ListSecurityReportHistoryPeriodsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityReportHistoryPeriodsRequest::getOffset,
                ListSecurityReportHistoryPeriodsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityReportSendingRecordsRequest, ListSecurityReportSendingRecordsResponse> listSecurityReportSendingRecords =
        genForListSecurityReportSendingRecords();

    private static HttpRequestDef<ListSecurityReportSendingRecordsRequest, ListSecurityReportSendingRecordsResponse> genForListSecurityReportSendingRecords() {
        // basic
        HttpRequestDef.Builder<ListSecurityReportSendingRecordsRequest, ListSecurityReportSendingRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityReportSendingRecordsRequest.class,
                    ListSecurityReportSendingRecordsResponse.class)
                .withName("ListSecurityReportSendingRecords")
                .withUri("/v1/{project_id}/waf/security-report/sending-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("report_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityReportSendingRecordsRequest::getReportName,
                ListSecurityReportSendingRecordsRequest::setReportName));
        builder.<String>withRequestField("report_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityReportSendingRecordsRequest::getReportCategory,
                ListSecurityReportSendingRecordsRequest::setReportCategory));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSecurityReportSendingRecordsRequest::getLimit,
                ListSecurityReportSendingRecordsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSecurityReportSendingRecordsRequest::getOffset,
                ListSecurityReportSendingRecordsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityReportContentRequest, ShowSecurityReportContentResponse> showSecurityReportContent =
        genForShowSecurityReportContent();

    private static HttpRequestDef<ShowSecurityReportContentRequest, ShowSecurityReportContentResponse> genForShowSecurityReportContent() {
        // basic
        HttpRequestDef.Builder<ShowSecurityReportContentRequest, ShowSecurityReportContentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecurityReportContentRequest.class,
                    ShowSecurityReportContentResponse.class)
                .withName("ShowSecurityReportContent")
                .withUri("/v1/{project_id}/waf/security-reports/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityReportContentRequest::getReportId,
                ShowSecurityReportContentRequest::setReportId));
        builder.<String>withRequestField("subscription_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityReportContentRequest::getSubscriptionId,
                ShowSecurityReportContentRequest::setSubscriptionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityReportSubscriptionRequest, ShowSecurityReportSubscriptionResponse> showSecurityReportSubscription =
        genForShowSecurityReportSubscription();

    private static HttpRequestDef<ShowSecurityReportSubscriptionRequest, ShowSecurityReportSubscriptionResponse> genForShowSecurityReportSubscription() {
        // basic
        HttpRequestDef.Builder<ShowSecurityReportSubscriptionRequest, ShowSecurityReportSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecurityReportSubscriptionRequest.class,
                    ShowSecurityReportSubscriptionResponse.class)
                .withName("ShowSecurityReportSubscription")
                .withUri("/v1/{project_id}/waf/security-report/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityReportSubscriptionRequest::getSubscriptionId,
                ShowSecurityReportSubscriptionRequest::setSubscriptionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityReportSubscriptionRequest, UpdateSecurityReportSubscriptionResponse> updateSecurityReportSubscription =
        genForUpdateSecurityReportSubscription();

    private static HttpRequestDef<UpdateSecurityReportSubscriptionRequest, UpdateSecurityReportSubscriptionResponse> genForUpdateSecurityReportSubscription() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityReportSubscriptionRequest, UpdateSecurityReportSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSecurityReportSubscriptionRequest.class,
                    UpdateSecurityReportSubscriptionResponse.class)
                .withName("UpdateSecurityReportSubscription")
                .withUri("/v1/{project_id}/waf/security-report/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityReportSubscriptionRequest::getSubscriptionId,
                UpdateSecurityReportSubscriptionRequest::setSubscriptionId));
        builder.<UpdateSecurityReportSubscriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityReportSubscriptionRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityReportSubscriptionRequest::getBody,
                UpdateSecurityReportSubscriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebProtectionRuleRequest, ShowWebProtectionRuleResponse> showWebProtectionRule =
        genForShowWebProtectionRule();

    private static HttpRequestDef<ShowWebProtectionRuleRequest, ShowWebProtectionRuleResponse> genForShowWebProtectionRule() {
        // basic
        HttpRequestDef.Builder<ShowWebProtectionRuleRequest, ShowWebProtectionRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWebProtectionRuleRequest.class, ShowWebProtectionRuleResponse.class)
            .withName("ShowWebProtectionRule")
            .withUri("/v1/{project_id}/waf/web-protection-rules/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebProtectionRuleRequest::getRuleId, ShowWebProtectionRuleRequest::setRuleId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebProtectionRuleRequest::getXLanguage,
                ShowWebProtectionRuleRequest::setXLanguage));

        // response

        return builder.build();
    }

}
