package run.freshr.common.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * Enum Util
 *
 * @author FreshR
 * @apiNote Enum Util
 * @since 2024. 3. 26. 오후 4:11:51
 */
@Slf4j
public class EnumUtil {

  /**
   * Enum 조회
   *
   * @param <E>       type parameter
   * @param enumClass enum class
   * @param word      word
   * @return e
   * @apiNote Enum key 를 기준으로 조회<br>
   *          조회 데이터가 없으면 null 반환
   * @author FreshR
   * @since 2024. 3. 26. 오후 4:11:51
   */
  public static <E extends Enum<E>> E find(Class<E> enumClass, String word) {
    return find(enumClass, word, null);
  }

  /**
   * Enum 조회
   *
   * @param <E>         type parameter
   * @param enumClass   enum class
   * @param word        word
   * @param defaultEnum default enum
   * @return e
   * @apiNote Enum key 를 기준으로 조회<br>
   *          조회 데이터가 없으면 defaultEnum 반환
   * @author FreshR
   * @since 2024. 3. 26. 오후 4:11:51
   */
  public static <E extends Enum<E>> E find(Class<E> enumClass, String word, E defaultEnum) {
    E enumeration;

    try {
      enumeration = Enum.valueOf(enumClass, word.toUpperCase());
    } catch (Exception e) {
      enumeration = defaultEnum;

      log.error(e.getMessage(), e);
    }

    return enumeration;
  }

}
