

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

class Task0009Test {
    private Task0009 task;

    @BeforeEach
    public void initData() {
        task = new Task0009();
    }

    @Test
    void when121IsPalindrome() {
        boolean result = task.isPalindrome(121);
        assertThat(result).isTrue();
    }

    @Test
    void whenMinus121IsNotPalindrome() {
        boolean result = task.isPalindrome(-121);
        assertThat(result).isFalse();
    }

    @Test
    void when10IsNotPalindrome() {
        boolean result = task.isPalindrome(10);
        assertThat(result).isFalse();
    }
}