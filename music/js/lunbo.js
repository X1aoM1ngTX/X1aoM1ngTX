const sliderWrapper = document.querySelector('.slider-wrapper');
const indicators = document.querySelectorAll('.indicator');

let currentIndex = 0;

function updateSlider() {
    const newTransformValue = -currentIndex * 1000 + 'px';
    sliderWrapper.style.transform = 'translateX(' + newTransformValue + ')';
    updateIndicators();
}

function updateIndicators() {
    indicators.forEach((indicator, index) => {
        indicator.classList.toggle('active', index === currentIndex);
    });
}

function nextSlide() {
    currentIndex = (currentIndex + 1) % 3;
    updateSlider();
}

function prevSlide() {
    currentIndex = (currentIndex - 1 + 3) % 3;
    updateSlider();
}

indicators.forEach((indicator, index) => {
    indicator.addEventListener('click', () => {
        currentIndex = index;
        updateSlider();
    });
});

setInterval(nextSlide, 5000); // 切换间隔，单位：毫秒