import java.util.List;

import static java.io.ObjectInputFilter.merge;

public class Task2MergeSort {
/*
   сортировка слиянием относится к группе алгоритмов
   "разделяй и властвуй" - "divide and conquer"
   идея - разбить список на две половинки, отсортируем каждую, затем сольём назад в один список
   в пределе каждый список состоит из одного элемента, и он УЖЕ остортирован

   сортировка существующего списка (без создания сортировочной копии) - сортировка in-place
   иногда сортировка происходит in-place только внешне - внутри создвётся отсортированная копия,
   которой занимается оригинал
 */
  public static List<Integer> sort(List<Integer> numbers) {
    if (numbers.size() < 2) {
      return numbers;
    }

    int mid = numbers.size() / 2;
    List<Integer> left = numbers.subList(0, mid);
    List<Integer> right = numbers.subList(mid, numbers.size());

    left = sort(left);
    right = sort(right);

    return merge(left, right);
  }
  private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {

  }
}
