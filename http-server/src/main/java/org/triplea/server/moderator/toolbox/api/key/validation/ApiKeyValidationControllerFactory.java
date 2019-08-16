package org.triplea.server.moderator.toolbox.api.key.validation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.jdbi.v3.core.Jdbi;
import org.triplea.server.http.AppConfig;

/** Factory class to create api key validation and security (rate-limiting) classes. */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ApiKeyValidationControllerFactory {

  public static ApiKeyValidationController buildController(
      final AppConfig appConfig, final Jdbi jdbi) {
    return new ApiKeyValidationController(
        ApiKeyValidationServiceFactory.apiKeyValidationService(appConfig, jdbi));
  }
}